import com.company.*;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class StudentTest {
    @Test
    public void testNaughty(){
        ArrayList<Double> grades =  new ArrayList<Double>();
        grades.add(20.4);
        grades.add(44.2);
        grades.add(70.1);
        ArrayList<Double> grades2 =  new ArrayList<Double>();
        grades2.add(25.4);
        grades2.add(34.2);
        grades2.add(70.1);
        NaughtyStudent badStudent = new NaughtyStudent(grades,"Barbara", IHasLevel.Level.FIRST);
        NaughtyStudent badStudent2 = new NaughtyStudent(grades2,"Tony",IHasLevel.Level.FIRST);
        Student goodStudent = new Student(grades, "Chris",IHasLevel.Level.THIRD);
        Student goodStudent2 = new Student(grades2, "Sam",IHasLevel.Level.FIRST);
        Lecture TLC3 = new Lecture();
        TLC3.enterLecture(goodStudent);
        TLC3.enterLecture(goodStudent2);
        //TLC3.enterLecture(badStudent);
        ///TLC3.enterLecture(badStudent2);

        Double correctAverage = (20.4+44.2+70.1)/3;     //computing average myself. correct average
        Double increasedGrades = 1.1*goodStudent.getAverageGrade();    //increasing average by 10%

        //creating Register of Students
        ArrayList<Student> studentsList = new ArrayList<Student>();
        studentsList.add(goodStudent);
        studentsList.add(goodStudent2);
        studentsList.add(badStudent);

        //list of actual names
        ArrayList<String> realNames = new ArrayList<String>();
        realNames.add("Barbara");
        realNames.add("Chris");
        realNames.add("Sam");


        Register TlcRegister = new Register(studentsList);
        ArrayList<String> tlcStudentsNames = TlcRegister.getRegister();

        Map<IHasLevel.Level, List<Student>>  firstYearStudents= TlcRegister.getRegisterByLevel(IHasLevel.Level.FIRST);

         List<Student> list = firstYearStudents.get(IHasLevel.Level.FIRST);

         list = TlcRegister.sort();
        //for(Student s: list){
          //  System.out.println(s.getName());
        //}

        Student testStudent = TlcRegister.getStudentByName("Sam");   //function to get student by name
        System.out.println(testStudent.getName());

        //prints name of students in first levelß

        //ASSERTIONS
        assertEquals(realNames, TlcRegister.getRegister());
        assertEquals((Math.max(goodStudent.getAverageGrade(), goodStudent2.getAverageGrade())),TLC3.getHighestAverageGrade(),1e-15);   //tests that the function returns the highest average
        assertEquals(correctAverage,goodStudent.getAverageGrade(),1e-15);    //test that getAverageGrade actually computes the right average
        assertTrue(badStudent instanceof Student);   //test that badStudent object is a Student
        assertEquals(badStudent.getAverageGrade(),increasedGrades,1e-15);   //test to verify that hacked average increased by 10%
    }

}

import com.company.IHasLevel;
import com.company.INameable;
import com.company.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Register {
    private List<Student> students = new ArrayList<Student>();
    public Register(List<Student> students){
    this.students = students;
    }

    public ArrayList<String> getRegister(){
        ArrayList<String> stringList = new ArrayList<String>();
        for(Student s: students){
            stringList.add(s.getName());
        }
        return stringList;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Map<IHasLevel.Level, List<Student>> getRegisterByLevel(IHasLevel.Level studentLvl){
        BagOfStudents<IHasLevel.Level, List<Student>> studentRegister = new BagOfStudents<IHasLevel.Level, List<Student>>();

        List<Student> tlcClass  = new ArrayList<Student>();     //the list of students

        for(Student s: students){
            if(s.getLevel() == studentLvl){
                tlcClass.add(s);
            }
        }

        studentRegister.addStudent(IHasLevel.Level.FIRST, tlcClass);
        return studentRegister.getBagOfStudents();
    }

    public String printReport(){
            return "foRMATTED stuents list";    // dont forget
    }

    public List<Student> sort(){
        StudentSorter nameSort = new StudentSorter();   //initializing comparator object
        Collections.sort(students,nameSort);
        return getStudents();     //returns sorted list of students
    }

    public Student getStudentByName(String name){
        try{
            for(Student s: students){
                if(s.getName().equals(name))
                    return s;
            }
            throw new NoStudentException();
        } catch (NoStudentException e){
            System.out.println("Couldn't find student "+name);

        }
        return null;
    }

    public Stream<Student> getStream(){      //get stream out of students list
        return students.stream();
    }

    public Double getHighestGrade(){
       // getStream().forEach(student -> student.getGradesAsStream().max(Comparator.naturalOrder()));
        return 0.52;
    }
}


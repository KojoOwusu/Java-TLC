package com.company;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Double> grades =  new ArrayList<Double>();
        grades.add(20.4);
        grades.add(44.2);
        grades.add(70.1);

	 Student Kojo = new Student(grades, "Kojo", IHasLevel.Level.FIRST);

        ArrayList<Double> grades2 =  new ArrayList<Double>();
        grades2.add(25.4);
        grades2.add(34.2);
        grades2.add(70.1);
          Student Yaa = new Student(grades2, "Yaa",IHasLevel.Level.FIRST );
          System.out.println(Kojo.getAverageGrade());
        System.out.println(Yaa.getAverageGrade());
       // Student Larry = new Student(24.2);
       // Student Kris  = new Student(84.2);

        Lecture TLC = new Lecture();
        TLC.enterLecture(Kojo);
        TLC.enterLecture(Yaa);
    //   TLC.enterLecture(Larry);
      // TLC.enterLecture(Kris);
        NaughtyStudent student1 = new NaughtyStudent(grades, "Franky",IHasLevel.Level.FINAL);
        System.out.println("This student hacked his results so his average is "+student1.getAverageGrade());

       System.out.println("The highest average in the class is "+TLC.getHighestAverageGrade());

    }
}

package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Lecture {
        private ArrayList<Student> studentsInClass = new ArrayList<Student>();    //list of students who are in the lecture

        public Lecture(){
                System.out.println("Created lecture");
        }

        public void enterLecture(Student student) {
                if(this.studentsInClass.add(student)){
                        System.out.println("added Student to the class");
                }else{
                        System.out.println("bleh!");
                }
        }//lets student enter class.

        public double getHighestAverageGrade(){
                Double Max = 0.0;
                for(Student s: studentsInClass){
                       if(Max.compareTo(s.getAverageGrade())<0) {
                               Max = s.getAverageGrade();
                       }
                }
                return Max;
        }
}




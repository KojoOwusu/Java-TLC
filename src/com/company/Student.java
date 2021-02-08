package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Student implements INameable,IHasLevel{

    private ArrayList<Double> studentGrades = new ArrayList<Double>();
    private Double studentAverage = 0.0;
    private IHasLevel.Level studentLvl;
    private  String Name;
    public Student(ArrayList<Double> grades, String Name, IHasLevel.Level lvl){
        studentGrades = grades;
       this.Name = Name;
       this.studentLvl = lvl;
    }
    public Student(Double average){
        studentAverage = average;
    }

    public double getAverage(){
        return studentAverage;
    }

    public double getAverageGrade(){
        Double sum = 0.0;
        //sum of studentGrades / length of grades list
        for(Double grade: studentGrades){
            sum+=grade;
        }
        studentAverage = sum/studentGrades.size();
        return sum/studentGrades.size();
    }

    public String getName(){
        return Name;
    }

    public IHasLevel.Level getLevel(){
        return studentLvl;
    }

    public Stream<Double> getGradesAsStream(){
           return studentGrades.stream();
    }
}

package com.company;

import java.util.ArrayList;

public class NaughtyStudent extends Student{
    public NaughtyStudent(ArrayList<Double> grades, String Name, Level lvl){
        super(grades, Name, lvl);
    }

    @Override
    public double getAverageGrade() {
        return 1.1*super.getAverageGrade();   //modified function to increase average by 10%
    }
}





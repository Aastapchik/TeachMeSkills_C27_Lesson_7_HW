package com.TeachMeSkills.lesson7.task2.figure;

/*
**The class is a general class for shapes**
 */

public abstract class Figure {
    public String name;
    double[] length;
    abstract public double square(double[] length);


    abstract public double perimeter(double[] length);

}

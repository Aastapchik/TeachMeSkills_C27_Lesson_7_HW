package com.TeachMeSkills.lesson7.task2.figure;
/*
**The class describes a circle and contains methods for finding the area of the circle and circumference**
 */
public class Circle extends Figure{
    double PI = 3.1415926;
  //  String name = "Circle";
public Circle(String name){
    this.name = name;
}
    @Override
    public double square(double[] l) {
        return PI*l[0]*l[0];
    }

    @Override
    public double perimeter(double[] l) {
        return 2*PI*l[0];
    }
}

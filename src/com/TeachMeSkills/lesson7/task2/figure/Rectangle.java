package com.TeachMeSkills.lesson7.task2.figure;
/*
**The class describes a rectangle and contains methods for finding the area and perimeter of a rectangle**
 */
public class Rectangle extends Figure {
    //String name = "Rectangle";
    public Rectangle(String name){
        this.name = name;
    }
    @Override
   public  double square(double[] l) {
        return l[0]*l[1];
    }

    @Override
    public double perimeter(double[] l) {
        return 2*(l[0]+l[1]);
    }
}

package edu.gcccd.csis.java;

public class Circle {
    private double radius;
    private String color;
    private static long numOfCircles;

    public Circle(String color){
        radius = 1.0;
        this.color = color;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;

    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public final double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }
    public double getCircumference(){
        return (2 * Math.PI) * radius;
    }

    public static long getNumOfCircles() {
        return numOfCircles;
    }
}


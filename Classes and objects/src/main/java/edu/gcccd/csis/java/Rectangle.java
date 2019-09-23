package edu.gcccd.csis.java;

public class Rectangle {
    private double width;
    private double height;
    private static long numOfRectangles;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(){}


    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getCircumference(){
        return ( width * 2) + ( height * 2);
    }
    public static long getNumOfRectangles(){
        return numOfRectangles;
    }
    public boolean isSquare(){
        return width == height;
    }
}

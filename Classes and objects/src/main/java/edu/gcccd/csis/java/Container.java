package edu.gcccd.csis.java;

public class Container {
    private Rectangle rectangle;
    private Circle circle;

    public void setCircle(Circle circle){
        this.circle = circle;
    }
    public void setRectangle(Rectangle rectangle){
        this.rectangle = rectangle;
    }

    public Circle getCircle(){
        return circle;

    }

    public Rectangle getRectangle(){
        return rectangle;
    }

    public int size() {
        int result = 0;

        if (circle != null) result++;
        if (rectangle != null) result++;

        return result;}

    public static void main (String[] args){
        Container container = new Container();
        container.setCircle(new Circle(8.0,"Yellow"));
        container.setRectangle(new Rectangle(8.0,9.0 ));

        System.out.println(container.getCircle().getArea());
        System.out.println(container.getCircle().getRadius());
        System.out.println(container.getCircle().getColor());
        System.out.println(container.getCircle().getCircumference());

        System.out.println(container.getRectangle().getArea());
        System.out.println(container.getRectangle().getWidth());
        System.out.println(container.getRectangle().getHeight());
        System.out.println(container.getRectangle().getCircumference());
        System.out.println(container.getRectangle().isSquare());

    }

}

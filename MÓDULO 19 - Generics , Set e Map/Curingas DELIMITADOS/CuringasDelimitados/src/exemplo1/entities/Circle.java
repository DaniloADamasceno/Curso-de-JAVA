package exemplo1.entities;

public class Circle implements Shape {
    private double radius;

    //------------------------------------
    //      Contrutores
    //------------------------------------
    public Circle(double radius) {
        this.radius = radius;
    }

    //------------------------------------
    //      Getters and Setters
    //------------------------------------
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //------------------------------------
    //      Metodos
    //------------------------------------
    public double area() {
        return Math.PI * radius * radius;
    }
}

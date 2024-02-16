package exemploOne1.entities;

public class Circle implements Shape {
    private double radius;

    //! --------------------------------------------      Construtores      --------------------------------------------
    public Circle(double radius) {
        this.radius = radius;
    }

    //! -----------------------------------------      Getters and Setters      ----------------------------------------
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //! -------------------------------------------------      Métodos      --------------------------------------------
    public double area() {
        return Math.PI * radius * radius;
    }
}

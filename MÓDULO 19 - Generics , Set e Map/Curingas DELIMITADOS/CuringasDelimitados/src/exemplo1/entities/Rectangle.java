package exemplo1.entities;

public class Rectangle implements Shape {
    private double width;
    private double height;

    //------------------------------------
    //      Contrutores
    //------------------------------------
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //------------------------------------
    //      Getters and Setters
    //------------------------------------
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //------------------------------------
    //      Metodos
    //------------------------------------
    public double area() {
        return width * height;
    }
}


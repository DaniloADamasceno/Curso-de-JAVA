package generalEntities;

public class Circle extends GeometricShape {

    double radius;

    //!--------------------------------------          CONSTRUCTORS     ------------------------------------------------
    public Circle() {
        super();
    }

    public Circle(Color ColorShape, double radius) {
        super(ColorShape);
        this.radius = radius;
    }

    //! ------------------------------------------          GETTERS and SETTERS     ------------------------------------
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //!--------------------------------------          METHODS     -----------------------------------------------------
    //%% Area
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

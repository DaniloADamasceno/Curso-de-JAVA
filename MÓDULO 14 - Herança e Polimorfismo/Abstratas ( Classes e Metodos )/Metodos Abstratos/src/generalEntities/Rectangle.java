package generalEntities;

public class Rectangle extends GeometricShape {

    private double width;
    private double height;

    //!--------------------------------------          CONSTRUCTORS     ------------------------------------------------
    public Rectangle() {
        super();
    }

    public Rectangle(Color ColorShape, double width, double height) {
        super(ColorShape);
        this.width = width;
        this.height = height;
    }

    //! ------------------------------------------          GETTERS and SETTERS     ------------------------------------
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

    //!--------------------------------------          METHODS     -----------------------------------------------------
    //%% Area
    @Override
    public double area() {
        return width * height;
    }
}

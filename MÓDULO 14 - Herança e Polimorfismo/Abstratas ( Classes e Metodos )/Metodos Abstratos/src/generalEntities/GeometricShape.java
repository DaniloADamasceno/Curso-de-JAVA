package generalEntities;

public abstract class GeometricShape {

    private Color ColorShape;

    //!--------------------------------------          CONSTRUCTORS     ------------------------------------------------
    public GeometricShape() {
    }

    public GeometricShape(Color ColorShape) {
        this.ColorShape = ColorShape;
    }

    //! ------------------------------------------          GETTERS and SETTERS     ------------------------------------
    public Color getColor() {
        return ColorShape;
    }

    public void setColor(Color ColorShape) {
        this.ColorShape = ColorShape;
    }

    //!--------------------------------------          METHODS     -----------------------------------------------------
    //%% Area
    public abstract double area(); // criar um método abstrato para as areas das formas
}

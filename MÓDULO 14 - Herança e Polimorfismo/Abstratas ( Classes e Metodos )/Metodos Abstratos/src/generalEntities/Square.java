package generalEntities;

public class Square extends GeometricShape {

    public double square;

    //!--------------------------------------          CONSTRUCTORS     ------------------------------------------------
    public Square() {
        super();
    }

    public Square(Color ColorShape, double square) {
        super(ColorShape);
        this.square = square;
    }

    //! ------------------------------------------          GETTERS and SETTERS     ------------------------------------
    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    //!--------------------------------------          METHODS     -----------------------------------------------------
    //%% Area
    @Override
    public double area() {
        return square * square;
    }
}

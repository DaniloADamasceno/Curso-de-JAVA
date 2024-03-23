package shapes.entities;

import shapes.enums.Color;

public class Circle extends FormAbstract {

    private Double radius; // Raio do círculo

    //!   ----------------------------------    CONSTRUCTOR     --------------------------------------------------------
    public Circle() {}

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    //!  ----------------------------------------    GETTERS AND SETTERS    --------------------------------------------
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    //!   -------------------------------------------      METHODS      ------------------------------------------------
    //%% Calcula a área do círculo
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

package model_shapes.entities_Shapes;

import model_shapes.enums_shapes.Color;

public class Circle extends FormAbstract {

  private Double radius; // Raio do círculo

  //-------------------
  //!   CONSTRUTORES
  //-------------------
  public Circle() {}

  public Circle(Color color, Double radius) {
    super(color);
    this.radius = radius;
  }

  //-------------------
  //!   GETTERS E SETTERS
  //-------------------

  public Double getRadius() {
    return radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }

  //-------------------
  //!   MÉTODOS
  //-------------------
  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}

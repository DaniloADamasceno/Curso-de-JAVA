package modelShapes.entitiesShapes;

import modelShapes.enums_shapes.Color;


public class Rectangle extends FormAbstract {

      private Double width; // Largura do retângulo
      private Double height; // Altura do retângulo

      //-------------------
      //!   CONSTRUTORES
      //-------------------
      public Rectangle() {
      }
      
      public Rectangle(Color color, Double width, Double height) {
            super(color);
            this.width = width;
            this.height = height;
      }

      //-------------------
      //!   GETTERS E SETTERS
      //-------------------
      public Double getWidth() {
            return width;
      }

      public void setWidth(Double width) {
            this.width = width;
      }

      public Double getHeight() {
            return height;
      }

      public void setHeight(Double height) {
            this.height = height;
      }

      //-------------------
      //!   MÉTODOS
      //-------------------
      @Override
      public double area() {
            return width * height;
      }

      
    
}
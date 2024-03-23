package shapes.entities;

import shapes.enums.Color;


public class Rectangle extends FormAbstract {

      private Double width; // Largura do retângulo
      private Double height; // Altura do retângulo

      //!   ----------------------------------    CONSTRUCTOR     --------------------------------------------------------
      public Rectangle() {
      }
      
      public Rectangle(Color color, Double width, Double height) {
            super(color);
            this.width = width;
            this.height = height;
      }

      //!  ----------------------------------------    GETTERS AND SETTERS    --------------------------------------------
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

      //!   -------------------------------------------      METHODS      ------------------------------------------------
      //%%  Calcula a área do retângulo
      @Override
      public double area() {
            return width * height;
      }

      
    
}
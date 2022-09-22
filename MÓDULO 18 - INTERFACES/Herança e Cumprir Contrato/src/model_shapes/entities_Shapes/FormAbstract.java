package model_shapes.entities_Shapes;

import model_shapes.enums_shapes.Color;

public abstract class FormAbstract implements Shape {
    
      private Color color;

      //-------------------
      //!   CONSTRUTORES
      //-------------------
      public FormAbstract() {
      }
      
      public FormAbstract(Color color) {
            this.color = color;
      }

      //-------------------
      //!   GETTERS E SETTERS
      //-------------------
      public Color getColor() {
            return color;
      }

      public void setColor(Color color) {
            this.color = color;
      }
      
}
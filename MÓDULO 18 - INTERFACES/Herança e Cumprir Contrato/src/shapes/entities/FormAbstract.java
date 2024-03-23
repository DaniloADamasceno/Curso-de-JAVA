package shapes.entities;

import shapes.enums.Color;

public abstract class FormAbstract implements Shape {
    
      private Color color;

      //!   ----------------------------------    CONSTRUCTOR     --------------------------------------------------------
      public FormAbstract() {
      }
      
      public FormAbstract(Color color) {
            this.color = color;
      }

      //!  ----------------------------------------    GETTERS AND SETTERS    --------------------------------------------
      public Color getColor() {
            return color;
      }

      public void setColor(Color color) {
            this.color = color;
      }
}
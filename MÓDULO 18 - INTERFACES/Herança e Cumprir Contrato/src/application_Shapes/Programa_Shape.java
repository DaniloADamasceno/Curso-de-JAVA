package application_Shapes;

import model_shapes.entities_Shapes.Circle;
import model_shapes.entities_Shapes.FormAbstract;
import model_shapes.entities_Shapes.Rectangle;
import model_shapes.enums_shapes.Color;

public class Programa_Shape {

  public static void main(String[] args)  {
    System.out.println("Hello, World!");

    FormAbstract s1 = new Circle(Color.BLACK, 2.0);
    FormAbstract s2 = new Rectangle(Color.WHITE , 3.0 , 4.0);
    
    System.out.println("Circle color: " + s1.getColor());
    System.out.println("Circle area: " + String.format("%.2f", s1.area()));
    System.out.println("Rectangle color: " + s2.getColor());
    System.out.println("Rectangle area: " + String.format("%.2f", s2.area()));
  }
}

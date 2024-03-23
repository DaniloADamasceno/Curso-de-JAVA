package applicationShapes;

import shapes.entities.Circle;
import shapes.entities.FormAbstract;
import shapes.entities.Rectangle;
import shapes.enums.Color;

public class ProgramaShape {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        FormAbstract s1 = new Circle(Color.BLACK, 2.0);
        FormAbstract s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.2f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.2f", s2.area()));
    }
}

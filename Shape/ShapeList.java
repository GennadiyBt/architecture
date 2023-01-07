package Shape;

import java.util.ArrayList;
import java.util.List;
import Shape.Elements.*;

public class ShapeList {
    public static void main(String[] args) {
    
    BaseElements circle = new Circle(3);
    circle.info();

    BaseElements rectangle = new Rectangle(5,4);
    rectangle.info();

    BaseElements square = new Square(3);
    square.info();

    BaseElements triangle = new Triangle(3,4,5);
    triangle.info();
    

    List <BaseElements> workedList = new ArrayList<>();

    workedList.add(circle);
    workedList.add(rectangle);
    workedList.add(square);
    workedList.add(triangle);

    Metods.infoElement(workedList);
    System.out.println();
    System.out.println();
    Metods.infoElement(workedList, 2);
    System.out.println("Сумма периметров всех фигур: " + Metods.allPerimeters(workedList));
    System.out.println("Сумма площадей всех фигур: " + Metods.allArea(workedList));
    }
    
}


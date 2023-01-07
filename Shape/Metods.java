package Shape;

import java.util.List;

import Shape.Elements.*;

public abstract class Metods {
    
    public Metods(){};


    /* 
    Метод для вывода информации. В зависимости от подставленных аргументов выводит либо информацию о всех
    элементах подряд, либо о конкретном элементе с заданным индексом
    */ 
    public static void infoElement(List<BaseElements> array) {
        for (BaseElements shape : array) {
            shape.info();
            System.out.println("--------------------");
        }
    }

    public static void infoElement(List<BaseElements> array, int i) {
        array.get(i).info();
    }

    //Метод подсчета суммарного периметра всех фигур массива
    public static double allPerimeters(List<BaseElements> array) {
        double sumPerimeter = 0;
        for (BaseElements shape : array) {
            sumPerimeter += shape.perimeter();
        }
        return sumPerimeter;
    }

    //Метод подсчета суммарной площади всех фигур массива
    public static double allArea(List<BaseElements> array) {
        double sumArea = 0;
        for (BaseElements shape : array) {
            sumArea += shape.area();
        }
        return sumArea;
    }

}

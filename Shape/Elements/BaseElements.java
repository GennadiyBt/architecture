package Shape.Elements;

import Shape.Interfaсe.Options;

/**
 * BaseElements
 */
public abstract class BaseElements implements Options{

    private String type;
    private double size;  // линейный параметр, который будет минимум в одном экземпляре у любой фигуры

    public void setType(String figure) {
        type = figure;
    }

    public String getType(){
        return type;
    }
    
    public void setSize(double a) {
        size = a;
    }

    public double getSize(){
        return size;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return 0;
    }
}
package Shape.Elements;

public class Circle extends BaseElements{

    public Circle(double radius){
        if (radius <= 0){
           throw new RuntimeException("Нельзя создать круг с радиусом меньше или равным 0");
        }
        super.setType("circle");
        super.setSize(radius);
    }

    // перегружаем методы родительского класса
    public double area() {
        return Math.PI*getSize()*getSize();
    }

    public double perimeter() {
        return 2*Math.PI*getSize();
    }

    @Override
    public void info() {
        // TODO Auto-generated method stub
       System.out.println("Figure:" + getType()); 
       System.out.println("Radius: " + getSize());
       System.out.println("Perimeter: " + perimeter());
       System.out.println("Area: " + area());
    }
    
}

package Shape.Elements;

public class Square extends BaseElements{
    
    public Square(double a){
        super.setType("square");
        super.setSize(a);
    }

    // перегружаем методы родительского класса
    public double area() {
        return getSize()*getSize();
    }

    public double perimeter() {
        return getSize()*4;
    }

    @Override
    public void info() {
        // TODO Auto-generated method stub
       System.out.println("Figure:" + getType()); 
       System.out.println("Side: " + getSize());
       System.out.println("Perimeter: " + perimeter());
       System.out.println("Area: " + area());
    }
}

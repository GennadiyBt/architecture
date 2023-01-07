package Shape.Elements;

public class Triangle extends BaseElements {

    private double b;
    private double c;
    
    public Triangle(double a, double b, double c){
        super.setType("triangle");
        super.setSize(a);
        this.b = b;
        this.c = c;
    }

    // перегружаем методы родительского класса
    public double area() {
        double p = (getSize()+b+c)/2; // полупериметр выносим отдельной переменной для простоты чтения кода
        return Math.sqrt(p*(p-getSize())*(p-b)*(p-c));
    }

    public double perimeter() {
        return getSize()+b+c;
    }

    @Override
    public void info() {
        // TODO Auto-generated method stub
       System.out.println("Figure:" + getType()); 
       System.out.println("Side A: " + getSize());
       System.out.println("Side B: " + b);
       System.out.println("Side C: " + c);
       System.out.println("Perimeter: " + perimeter());
       System.out.println("Area: " + area());
    }
    
}

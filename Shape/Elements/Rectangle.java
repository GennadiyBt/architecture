package Shape.Elements;

public class Rectangle extends BaseElements {
    
    private double b;

    public Rectangle(double a, double b){
        super.setType("rectangle");
        super.setSize(a);
        this.b = b;
    }

    public void setB(double n) {
        b = n;
    }

    // перегружаем методы родительского класса
    public double area() {
        return getSize()*b;
    }

    public double perimeter() {
        return (getSize()+b)*2;
    }

    @Override
    public void info() {
        // TODO Auto-generated method stub
       System.out.println("Figure:" + getType()); 
       if (getSize() > b){
            System.out.println("Length: " + getSize());
            System.out.println("Width: " + b);
       }
       else {
        System.out.println("Length: " + b);
        System.out.println("Width: " + getSize());
       }
       System.out.println("Perimeter: " + perimeter());
       System.out.println("Area: " + area());
    }
}

public class Rectangle extends Shapes{
    private double a;
    private double b;

    @Override
    public void findArea() {
        super.findArea();
        System.out.println("Area of rectangle :  S="+ a*b);

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}

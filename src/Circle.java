public class Circle extends Shapes {

    private final double PI = Math.PI;
private double a;
    public Circle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public void findArea() {
        super.findArea();
        System.out.println("\nArea of circle : S= " + PI * (a * a));
    }
}

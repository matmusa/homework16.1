public class Triangle extends Shapes {
    private double a;
    private double b;

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


    @Override
    public void findArea() {
        super.findArea();
        System.out.println("\nArea of right triangle :  S=" + 0.5 * a * b);
    }
}

public class Square extends Shapes{
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }



    @Override
    public void findArea() {
        super.findArea();
        System.out.println("\nSquare area :"+Math.pow(a,2));

    }
}

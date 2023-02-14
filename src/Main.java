import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("\nwrite a radius circle :");
        circle.setA(scanner.nextInt());
        circle.findArea();
        Square square = new Square();
        System.out.println("\nwrite a side square  :");
        square.setA(scanner.nextInt());
        square.findArea();
        System.out.println("\nwrite a side rectangle :");
        Rectangle rectangle = new Rectangle();
        rectangle.setA(scanner.nextInt());
        System.out.println("\nwrite b side  rectangle :");
        rectangle.setB(scanner.nextInt());
        rectangle.findArea();
        Triangle triangle = new Triangle();
        System.out.println("\nwrite a side triangle  :");
        triangle.setA(scanner.nextInt());
        System.out.println("\nwrite b side triangle :");
        triangle.setB(scanner.nextInt());
        triangle.findArea();


    }
}
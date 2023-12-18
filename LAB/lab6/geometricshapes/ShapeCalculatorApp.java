import java.util.Scanner;
/*import shapes.Square;
import shapes.Triangle;
import shapes.Circle;*/
import shapes.*;

public class ShapeCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape: ");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double squareSide = scanner.nextDouble();
                Square square = new Square(squareSide);
                System.out.println("Area of the square: " + square.getArea());
                System.out.println("Perimeter of the square: " + square.getPerimeter());
                break;
            case 2:
                System.out.print("Enter the base length of the triangle: ");
                double triangleBase = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double triangleHeight = scanner.nextDouble();
                System.out.print("Enter the length of side 1 of the triangle: ");
                double triangleSide1 = scanner.nextDouble();
                System.out.print("Enter the length of side 2 of the triangle: ");
                double triangleSide2 = scanner.nextDouble();
                System.out.print("Enter the length of side 3 of the triangle: ");
                double triangleSide3 = scanner.nextDouble();

                Triangle triangle = new Triangle(triangleBase, triangleHeight, triangleSide1, triangleSide2, triangleSide3);
                System.out.println("Area of the triangle: " + triangle.getArea());
                System.out.println("Perimeter of the triangle: " + triangle.getPerimeter());
                break;
            case 3:
                System.out.print("Enter the radius of the circle: ");
                double circleRadius = scanner.nextDouble();
                Circle circle = new Circle(circleRadius);
                System.out.println("Area of the circle: " + circle.getArea());
                System.out.println("Circumference of the circle: " + circle.getPerimeter());
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}


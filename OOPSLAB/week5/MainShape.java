import java.util.*;
import shapes.Square;
import shapes.Triangle;
import shapes.Circle;
public class MainShape{
    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose a shape to find area and perimeter:");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");

        int a=scanner.nextInt();
        switch(a){
            case 1:
            System.out.println("Enter the side length of the square:");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                System.out.println("Area of the square: " + square.area());
                System.out.println("Perimeter of the square: " + square.perimeter());
                break;
            case 2:
                System.out.println("Enter the base, height, and three sides of the triangle:");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height, side1, side2, side3);
                System.out.println("Area of the triangle: " + triangle.area());
                System.out.println("Perimeter of the triangle: " + triangle.perimeter());
                break;
            case 3:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area of the circle: " + circle.area());
                System.out.println("Perimeter of the circle: " + circle.perimeter());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
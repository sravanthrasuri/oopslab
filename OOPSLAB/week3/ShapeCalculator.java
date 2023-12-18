package week3;
class Shape {
    public double getArea(){
        return 0.0;
    }
    public double getPerimeter(){
        return 0.0;
    }
}
    class Square extends Shape{
        private double side;
        public Square(double side){
            this.side=side;
        }
        public double getArea(){
        return side*side;
        }
        public double getPerimeter(){
        return 4*side;
    }
    }
    class Circle extends Shape{
        private double radius;
        public Circle(double radius){
            this.radius=radius;
        }
        public double getArea(){
            return 3.14*radius*radius;
        }
        public double getPerimeter(){
            return 2*3.14*radius;
        }
    }
    class Rectangle extends Shape{
        private double a,b;
        public Rectangle(double a,double b){
            this.a=a;
            this.b=b;
        }
        public double getArea(){
            return a*b;
        }
        public double getPerimeter(){
            return 2*(a+b);
        }
    }

public class ShapeCalculator {
    public static void main(String args[]){
        Square s=new Square(10);
        Circle c=new Circle(5);
        Rectangle r=new Rectangle(5,2);

        System.out.println("Square Area:"+s.getArea());
        System.out.println("Square Perimeter:"+s.getPerimeter());
        System.out.println("Circle Area:"+c.getArea());
        System.out.println("Circle Perimeter:"+c.getPerimeter());
        System.out.println("Rectangle Area:"+r.getArea());
        System.out.println("Rectangle Perimeter:"+r.getPerimeter());
    }
}

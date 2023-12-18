package week4;
abstract class Shape2d{
    abstract double getArea();
}
abstract class Shape3d{
    abstract double getArea();
    abstract double getVolume();
}
class Square extends Shape2d{
    private double side;
    public Square(double side){
        this.side=side;
    }
    double getArea(){
        return side*side;
    }
}
class Circle extends Shape2d{
    private double r;
    public Circle(double r){
        this.r=r;
    }
    double getArea(){
        return 3.14*r*r;
    }
}
class Cube extends Shape3d{
    private double side;
    public Cube(double side){
        this.side=side;
    }
    double getArea(){
        return 6*side*side;
    }
    double getVolume(){
        return side*side*side;
    }
}
class Sphere extends Shape3d{
    private double r;
    public Sphere(double r){
        this.r=r;
    }
    double getArea(){
        return 4*3.14*r*r;
    }
    double getVolume(){
        return (4.0/3.0)*Math.PI*Math.pow(r,3);
    }
}
public class AreaVol{
    public static void main(String args[]){
        Square square = new Square(5);
       Circle circle = new Circle(3);
       Cube cube = new Cube(4);
       Sphere sphere = new Sphere(2);
       System.out.println("square area:"+square.getArea());
       System.out.println("circle area:"+circle.getArea());
       System.out.println("cube area:"+cube.getArea());
       System.out.println("cube volume:"+cube.getVolume());
       System.out.println("sphere area:"+sphere.getArea());
       System.out.println("sphere volume:"+sphere.getVolume());
    }
}
package week1;
public class CircleTest {
    public static void main(String args[]){
        Circle c1=new Circle(5);
        Circle c2=new Circle(10);
        Circle c3=new Circle(15);
        
        display(c1,1);
        display(c2,2);
        display(c3, 3);

    }
        public static void display(Circle c,int n){
            System.out.println("Circle Object-"+n);
            System.out.println("Area:"+String.format("%.2f",c.getArea()));
            System.out.println("Perimeter:"+String.format("%.2f",c.getPerimeter()));
        }
}

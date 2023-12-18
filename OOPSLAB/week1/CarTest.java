package week1;
public class CarTest {
    public static void main(String args[]){
        Car c1=new Car("Ford",15,100,"Red");
        Car c2=new Car("Toyota",14,80,"White");
        Car c3=new Car("Volkswagen",25,90,"Black");

        display(c1,1);
        display(c2,2);
        display(c3,3);
    }
    public static void display(Car car,int n){
        System.out.println();
        System.out.println("Object-"+n);
        System.out.println("Company:"+car.company);
        System.out.println("Color:"+car.color);
        System.out.println("Mileage:"+car.getMileage()+" km/l");
        System.out.println("Speed:"+car.getSpeed()+" km/h");
    }
}

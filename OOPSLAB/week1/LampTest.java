package week1;
public class LampTest {
    public static void main(String args[]){
        Lamp led=new Lamp(true,"LED");
        Lamp halogen=new Lamp(false,"Halogen");

        led.turnOn();
        led.turnOff();
        System.out.println();
        halogen.turnOn();
        halogen.turnOff();
    }
}

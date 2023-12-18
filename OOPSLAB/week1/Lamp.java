package week1;
public class Lamp {
    boolean isOn;
    String lampType;

    public Lamp(boolean isOn, String lampType){
        this.isOn=isOn;
        this.lampType=lampType;
    }
    public void turnOn(){
        isOn=true;
        System.out.println(lampType+"light is ON");
    }
    public void turnOff(){
        isOn=false;
        System.out.println(lampType+"light is OFF");
    }
}
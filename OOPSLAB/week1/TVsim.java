package week1;

public class TVsim {
    public static void main(String args[]){
        TV m=new TV();
        m.turnOn();
        m.setChannel(5);
        m.setVolume(3);
        m.channelUp();
        m.channelDown();
        m.volumeUp();
        m.volumeDowm();
        m.turnOff();
    }
}

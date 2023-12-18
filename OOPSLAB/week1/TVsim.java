package week1;

public class TVsim {
    public static void main(String args[]){
        TV m=new TV();
        m.turnOn();
        m.setChannel(5);
        m.setVolume(3);
        m.channelUp(6);
        m.channelDown(33);
        m.volumeUp();
        m.volumeDowm();
        m.turnOff();
    }
}

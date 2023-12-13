package week1;

public class TV {
    int channel;
    int volume;
    boolean on;

    public TV(){
        channel=1;
        volume=1;
        on = false;
    }
    public void turnOn(){
        on = true;
        System.out.println("TV is ON");
    }
    public void turnOff(){
        on = false;
        System.out.println("TV is Off");
    }
    public void setChannel(int newChannel){
        if(on && newChannel>=1 && newChannel<=40){
            channel=newChannel;
            System.out.println("Channel is set to:"+channel);
        }
        else{
            System.out.println("Invalid TV is turn Off");
        }
    }
    public void setVolume(int newVolume){
        if(on && volume>=1 && volume<=7){
            volume=newVolume;
            System.out.println("New volume level is:"+volume);
        }
        else{
            System.out.println("Invalid TV is turn Off");
        }
    }
    public void channelUp(){
        if(on && channel<40){
            channel++;
            System.out.println("Channel increased to:"+channel);
        }
        else{
            System.out.println("Channel cannot increase or TV is Off");
        }
    }
    public void channelDown(){
        if(on && channel>1){
            channel--;
            System.out.println("Channel decreased to:"+channel);
        }
        else{
            System.out.println("Channel cannot decrease or TV is Off");
        }
    }
    public void volumeUp(){
        if(on && volume<7){
            volume++;
            System.out.println("Volume increased to:"+volume);
        }
        else{
            System.out.println("Volume cannot increase or TV is Off");
        }
    }
    public void volumeDowm(){
        if(on && volume>1){
            volume--;
            System.out.println("Volume decreased to:"+volume);
        }
        else{
            System.out.println("Volume cannot decrease or TV is Off");
        }
    }
}
import java.util.*;
class TV
{
    int channel;
    int volume;
    boolean Switch;
    TV(int channel,int volume,boolean Switch)
    {
      this.setChannel(channel);
      this.setVolume(volume);
      this.setSwitch(Switch);
    }
    void setChannel(int channel)
    {
       this.channel=channel;
    }
    void setVolume(int volume)
    {
       this.volume=volume;
    }
    void setSwitch(boolean Switch)
    {
       this.Switch=Switch;
    }
    void channelUp()
    {
     if(channel==40)
     System.out.println("this is the last channel, now you can decrease the channel number");
     else
      channel++;
    }
    void channelDown()
    {
      if(channel==1)
      System.out.println("this is the first channel, now you can increase the channel number");
      else
      channel--;
    }
    void volumeUp()
    {
     if(volume==7)
     System.out.println("your volume is on high, now you can decrease the volume");
     else
      volume++;
    }
    void volumeDown()
    {
     if(volume==1)
      System.out.println("your volume is on low, now you can increase the volume");
      else
      volume--;
    }
    void turnOn()
    {
      if(Switch)
       System.out.println("your tv is already on");
       else
       Switch=true;
    }
    void turnOff()
    {
      if(!Switch)
       System.out.println("your tv is already off");
       else
       Switch=false;
    }
    void getStatus()
    {  
       if(Switch==true)
       System.out.println("TV is an On");
       else
       System.out.println("TV is Off");
    }
    void getChannel()
    {
     if(!Switch)
      System.out.println("TV is Off");
      else
      System.out.println("The number of the channel now running is:"+channel);
    }
    void getVolume()
    {
      if(!Switch)
      System.out.println("TV is Off");
      else
       System.out.println("volume is :"+volume);
    }
}

class Main
{
   public static void main(String[] args)
   {
     
      int channel;
    int volume;
    boolean Switch;
    Scanner s= new Scanner(System.in);
    System.out.println("enter the channel number(1 to 40):");
    channel=s.nextInt();
     System.out.println("enter the volume(1 to 7):");
    volume=s.nextInt();
     System.out.println("enter the tv (on=true/off=false):");
    Switch=s.nextBoolean();
    
     TV tele=new TV(channel,volume,Switch);
     tele.getStatus();
     tele.getChannel();
     tele.getVolume();
     tele.setSwitch(true);
     tele.setChannel(40);
     tele.setVolume(1);
      tele.getStatus();
     tele.getChannel();
     tele.getVolume();
     tele.channelUp();
     tele.channelDown();
      tele.volumeDown();
     tele.volumeUp();
     tele.getChannel();
     tele.getVolume();
     tele.turnOn();
     tele.turnOff();
     tele.getStatus();
   }
}

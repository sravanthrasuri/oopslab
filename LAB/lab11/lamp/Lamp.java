public class Lamp
{
  boolean isOn;
   Lamp(boolean isOn)
   {
      this.isOn=isOn;
   }
   void status()
   {
      System.out.println("status of the lamp is:"+isOn);
   }
   void turnOn()
   {
     if(!isOn)
     {
       isOn=true;
       System.out.println("Lamp is turned On");
     }
     else
       System.out.println("Lamp is already turned on");
   }
   void turnOff()
   {
     if(isOn)
     {
       isOn=false;
       System.out.println("Lamp is turned Off");
     }
     else
       System.out.println("Lamp is already turned off");
   }
}

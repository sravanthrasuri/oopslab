class Main
{
   public static void main(String[] args)
   {
       Lamp led=new Lamp(true);
       Lamp halogen=new Lamp(false);
     /*  led.status();
       led.turnOn();// already it is on state
       led.turnOff();// here off
       halogen.status();
       halogen.turnOn();// here we make on
       halogen.turnOff(); // here off
       halogen.turnOn();
       
       System.out.println("\n2nd phase\n");
       
        led.status();
       led.turnOff();
       led.turnOn();
       halogen.status();
       halogen.turnOff();
       halogen.turnOn();*/
       Lamp[] lights={led,halogen};
       for(Lamp x:lights)
       {
          x.status();
          x.turnOn();
          x.turnOff();
       }
       System.out.println("\n2nd phase\n");
       for(Lamp x:lights)
       {
          x.status();
          x.turnOn();
          x.turnOff();
       }
   }
}

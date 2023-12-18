import java.util.*;

   class Car
   {
       String company,color;
       double mileage;
       double speed;
      Car(String company,String color,double mileage,double speed)
      {
         this.company=company;
         this.color=color;
         this.mileage=mileage;
         this.speed=speed;
      }
      double getMileage()
      {
        //System.out.println(mileage);
        return mileage;
      }
      double getSpeed()
      {
        //System.out.println(speed);
        return speed;
      }
      String getCompany()
      {
        return company;
      }
      void getColor()
      {
        System.out.println(color);
      }
   }
   
   public class Main
{
   public static void main(String[] args)
   {
     Car Ford=new Car("ford","white",20,90);
     Car Toyota=new Car("toyota","silver",22,120);
     Car volkswagon=new Car("vento","red",25,100);
     Car[] details={Ford,Toyota,volkswagon};
     double max=Double.MIN_VALUE;
     String c=" ";
     for(Car i:details)
     {
        if(i.getSpeed()/i.getMileage() > max)
        {
           max=i.getSpeed()/i.getMileage();
           c=i.getCompany();
        }
     }
     System.out.println("company:"+c);
   }

}

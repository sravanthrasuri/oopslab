import java.util.*;
interface Fare
{
   double getFare();
   String getAmenities();
}

class Bus implements Fare
{
      private double distance;
      private String bustype;
      
      Bus(String bustype,double distance)
      {
         this.distance = distance;
         this.bustype= bustype;
      }
      
      int pricePerKilo;
      @Override
    public double getFare()
    {
      switch(bustype)
      {
         case "a/c":
           pricePerKilo = 20;
           break;
         case "sleeper":
           pricePerKilo = 30;
           break;
         case "non a/c":
           pricePerKilo = 15;
           break;
         default:
            pricePerKilo = 10;
           break;
      }
      return pricePerKilo*distance;
    }
    
    @Override
     public String getAmenities()
    {
      switch(bustype)
      {
         case "a/c":
           return "air conditioner is avail";
         case "sleeper":
           return "sleeping facility";
         case "non a/c":
           return "no air conditioner is avail";
         default:
            return "no amenities";
      }
      
    }
}


class Train implements Fare
{
      private double distance;
       private String traintype;
      
      Train(String traintype,double distance)
      {
         this.distance = distance;
         this.traintype= traintype;
      }
      
      int pricePerKilo;
      @Override
    public double getFare()
    {
      switch(traintype)
      {
         case "a/c":
           pricePerKilo = 15;
           break;
         case "sleeper":
           pricePerKilo = 10;
           break;
         case "general":
           pricePerKilo = 5;
           break;
         default:
            pricePerKilo = 2;
           break;
      }
      return pricePerKilo*distance;
    }
    
    @Override
     public String getAmenities()
    {
      switch(traintype)
      {
         case "a/c":
           return "air conditioner is avail";
         case "sleeper":
           return "sleeping class";
         case "general":
           return "general class";
         default:
            return "no amenities";
      }
      
    }
}

class Plain implements Fare
{
       private double distance;
       private String plaintype;
      
      Plain(String plaintype,double distance)
      {
         this.distance = distance;
         this.plaintype= plaintype;
      }
      
      int pricePerKilo;
      @Override
    public double getFare()
    {
      switch(plaintype)
      {
         case "business":
           pricePerKilo = 50;
           break;
         case "reservation":
           pricePerKilo = 30;
           break;
         default:
            pricePerKilo = 20;
           break;
      }
      return pricePerKilo*distance;
    }
    
    @Override
     public String getAmenities()
    {
      switch(plaintype)
      {
         case "business":
           return "air conditioner is avail and food";
         case "reservation":
           return "no air conditioner is avail";
         default:
            return "no amenities";
      }
      
    }
}


public class transport
{
   public static void main(String[] args)
   {
      Bus bus=new Bus("a/c",200);
      System.out.println("bus:");
      System.out.println("fare amount:"+bus.getFare());
      System.out.println("amenities:"+bus.getAmenities());
      Train train=new Train("sleeper",200);
      System.out.println("train:");
      System.out.println("fare amount:"+train.getFare());
      System.out.println("amenities:"+train.getAmenities());
      Plain plain=new Plain("business",200);
      System.out.println("bus:");
      System.out.println("fare amount:"+plain.getFare());
      System.out.println("amenities:"+plain.getAmenities());
   }
}

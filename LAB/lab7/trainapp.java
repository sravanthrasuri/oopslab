import java.util.*;

 class Berth
{
   private String coach;
   private int berth;
   Berth(String coach,int berth)
   {
      this.coach=coach;
      this.berth=berth;
   }
   
   public String getCoach()
   {
     return coach;
   }
   
   public int getberth()
   {
     return berth;
   }
   
   public String toString()
   {
     return coach+"-"+berth;
   }
}

 class TrainReservation
{
     private static final int AC_CAPACITY=70;
     private static final int SC_CAPACITY=70;
     
     private List<Berth> b1 = new ArrayList<>();
     private List<Berth> b2 = new ArrayList<>();
     private List<Berth> s1 = new ArrayList<>();
     private List<Berth> s2 = new ArrayList<>();
     
     public TrainReservation()
     {
       intializeberths(b1,"B1",AC_CAPACITY);
       intializeberths(b2,"B2",AC_CAPACITY);
       intializeberths(s1,"S1",SC_CAPACITY);
       intializeberths(s2,"S2",SC_CAPACITY);
     }
     
     private void intializeberths( List<Berth> berth,String coach,int capacity)
     {
       for(int i=1;i<=capacity;i++)
       {
          berth.add(new Berth(coach,i));
       }
     }
      
    public  List<Berth> bookberths(int numberths,String coach) throws ReservationException
    {
       if(numberths > 6)
       {
         throw new ReservationException("you may be an agent. but you cannot book ticket more then 6");
       }
       List<Berth> selectedberths;
       else if(coach.equalsIgnoreCase("A/C"))
       {
          selectedberths=bookactickets(numberths);
       }
      else if(coach.equalsIgnoreCase("sleeper"))
       {
          selectedberths=booksleepertickets(numberths);
       }
       else
       {
          throw new ReservationException("you have to select only ac or sleeper");
       }
       return selectedberths;
    }
    
    private List<Berth> bookactickets(int numberths)
    {
        List<Berth> available=new ArrayList<>();
       available.addAll(b1);
        available.addAll(b2);
        return bookberths(numberths,available);
    }
    
    private List<Berth> booksleepertickets(int numberths)
    {
        List<Berth> available=new ArrayList<>();
       available.addAll(s1);
        available.addAll(s2);
        
        return bookberths(numberths,available);
    }
    
    
    private List<Berth> bookberths(int numberths,List<Berth> available) throws ReservationException
    {
         if(available.size()<numberths)
            throw new ReservationException("avaialable tickets are less");
           Collections.shuffle(available);
           List<Berth> selected=available.subList(0,numberths);
           available.removeAll(selected);
           return selected;
    }
     
}

 class ReservationException extends Exception
 {
   public ReservationException(String msg)
   {
     super(msg);
   }
 }
 
 public class trainapp
 {
    public static void main(String[] args)
    {
     try{
       TrainReservation t=new TrainReservation();
       Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of berths (maximum 6): ");
            int numBerths = scanner.nextInt();

            System.out.print("Enter the coach type (A/C or Sleeper): ");
            String coachType = scanner.next();

            List<Berth> bookedBerths = t.bookberths(numBerths, coachType);

            System.out.println("Confirmed Berths: " + bookedBerths);

        }catch (ReservationException e) {
            System.out.println("Reservation Error: " + e.getMessage());
        }
    }
 }




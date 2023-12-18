abstract class Employee
{
   abstract double getAmount();
}

class HourlyEmployees extends Employee
{
    private double no_of_hours,total_hours;
    public HourlyEmployees(double no_of_hours,double total_hours)
    {
       	this.no_of_hours=no_of_hours;
       	this.total_hours=total_hours;
    }
    
    @Override
    double getAmount()
    {
      	return no_of_hours*total_hours*100;
    }
}

class WeeklyEmployees extends Employee
{
    private double no_of_weeks,total_weeks;
    public WeeklyEmployees(double no_of_weeks,double total_weeks)
    {
       	this.no_of_weeks=no_of_weeks;
       	this.total_weeks=total_weeks;
    }
    
    @Override
    double getAmount()
    {
      	return no_of_weeks*total_weeks*1000;
    }
}

class emp
{
   public static void main(String[] args)
   {
       HourlyEmployees he = new HourlyEmployees(5,10);
       WeeklyEmployees we = new WeeklyEmployees(10,20);
       
       System.out.println("hourly employee amount:"+ he.getAmount());
        System.out.println("weekly employee amount:"+ we.getAmount());
   }
}

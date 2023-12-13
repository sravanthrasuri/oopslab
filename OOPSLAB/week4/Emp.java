package week4;
abstract class Employee{
    abstract double getAmount();
}
class hourlyEmployee extends Employee{
    private double total_hours,no_of_hours;
    public hourlyEmployee(double total_hours,double no_of_hours){
        this.no_of_hours=no_of_hours;
        this.total_hours=total_hours;
    }
    double getAmount(){
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
class Emp{
    public static void main(String[] args)
    {
        hourlyEmployee he = new hourlyEmployee(5,10);
        WeeklyEmployees we = new WeeklyEmployees(10,20);
        
        System.out.println("hourly employee amount:"+ he.getAmount());
         System.out.println("weekly employee amount:"+ we.getAmount());
    }
}

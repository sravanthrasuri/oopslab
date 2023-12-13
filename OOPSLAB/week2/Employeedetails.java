package week2;
import java.util.*;
public class Employeedetails {
    public static void main(String args[]){
        Employee[] emp={
            new Employee(1, "John Doe", 30, "Male", "Software Engineer", 70000.0, "123 Main St"),
            new Employee(2, "Jane Smith", 28, "Female", "Data Scientist", 80000.0, "456 Oak St"),
        };
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee ID:");
        int a=sc.nextInt();
        boolean found=false;
        for(Employee e:emp){
            if(e.getID()==a){
                e.displayDetails();
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Employee with ID "+a+" not found");
        }
        sc.close();
    }
}

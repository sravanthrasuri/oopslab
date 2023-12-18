package week2;

public class Employee {
    private int ID;
    private String name;
    private int age;
    private String gender;
    private String designation;
    private double salary;
    private String address;

    public Employee(int ID,String name,int age,String gender,String designation,double salary,String address){
        this.ID=ID;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.designation=designation;
        this.salary=salary;
        this.address=address;
    }

    public int getID(){
        return ID;
    }
    public void displayDetails() {
        System.out.println("Employee Details for ID " + ID + ":");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
    }
}

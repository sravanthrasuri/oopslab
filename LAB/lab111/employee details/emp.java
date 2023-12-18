import java.util.*;
class details
{
   String emp_name,emp_gender,emp_designation,emp_address;
    private static  ArrayList<details> arr=new ArrayList<>();
   int emp_age,emp_salary,emp_id;
   details(String name,String gender,String designation,String address,int age,int salary,int id)
   {
      emp_name=name;
      emp_gender=gender;
      emp_designation=designation;
      emp_address=address;
      emp_age=age;
      emp_salary=salary;
      emp_id=id;
   }
   
  public void addemp(details d1){
   	arr.add(d1);
   }
   public static details getemp(int id)
   { 
     for(details i:arr)
     {
       if(id==i.emp_id)
       {
        return i;

       }
     }
     return null;
   }
}

class emp
{
   public static void main(String[] args)
   {
     String name,gender,designation,address;
     int age,salary,n,id;
     Scanner s=new Scanner(System.in);
     System.out.println("enter the no. of employees:");
     n=s.nextInt();
     
     for(int i=1;i<=n;i++)
     { 
       System.out.print(i+" enter emp id:");
       id=s.nextInt();
       System.out.print(i+" enter emp age:");
       age=s.nextInt();
       System.out.print(i+" enter emp salary:");
       salary=s.nextInt();
       System.out.print(i+" enter emp name:");
       name=s.next();
       System.out.print(i+" enter emp gender:");
       gender=s.next();
       System.out.print(i+" enter emp designation:");
       designation=s.next();
       s.nextLine();
       System.out.print(i+" enter emp address:");
       address=s.nextLine();
      details obj=new details(name,gender,designation,address,age,salary,id);
      obj.addemp(obj);
     }
     System.out.print(" enter emp id to search:");
       id=s.nextInt();
    details obj=details.getemp(id);
    if(obj!=null)
    {
      System.out.println("emp name:"+obj.emp_name);
      System.out.println("emp gender:"+obj.emp_gender);
      System.out.println("emp address:"+obj.emp_address);
      System.out.println("emp designation:"+obj.emp_designation);
      System.out.println("emp salary:"+obj.emp_salary);
      System.out.println("emp age:"+obj.emp_age);
    }
    else
    System.out.println("emp not found");
   }
}

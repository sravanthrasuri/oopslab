import complex.Arith;
import java.util.*;
public class MainComplex{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real part and imaginary part of 1st complex no:");
        int rp1 = sc.nextInt();
        int ip1 = sc.nextInt();

        System.out.println("Enter real part and imaginary part of 2nd complex no:");
        int rp2 = sc.nextInt();
        int ip2 = sc.nextInt();

        Arith a1= new Arith(rp1,ip1);
        Arith a2= new Arith(rp2,ip2);

        a1.display();
        a2.display();

        Arith a=new Arith();
        a.add(a1,a2);
        System.out.println("Added value: ");
        a.display();
        Arith b=new Arith();
        b.sub(a1,a2);
        System.out.println("Subtracted value: ");
        b.display();
    }
}
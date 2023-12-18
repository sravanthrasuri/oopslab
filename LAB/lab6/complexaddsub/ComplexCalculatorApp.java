import java.util.Scanner;
import complex.Arith;

public class ComplexCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first complex number
        System.out.print("Enter real part and imaginary part of 1st complex no: ");
        int rp1 = scanner.nextInt();
        int ip1 = scanner.nextInt();
        Arith a1 = new Arith(rp1, ip1);

        // Input for the second complex number
        System.out.print("Enter real part and imaginary part of 2nd complex no: ");
        int rp2 = scanner.nextInt();
        int ip2 = scanner.nextInt();
        Arith a2 = new Arith(rp2, ip2);

        // Display the entered complex numbers
      //  System.out.println("a1=" + a1.rp + (a1.ip >= 0 ? "+" : "") + a1.ip + "i");// becoz private
       // System.out.println("a2=" + a2.rp + (a2.ip >= 0 ? "+" : "") + a2.ip + "i");
       a1.display();
       a2.display();

        // Perform addition and display the result
        Arith sum = new Arith();
        sum.add(a1, a2);
        System.out.print("Added value: ");
        sum.display();

        // Perform subtraction and display the result
        Arith diff = new Arith();
        diff.sub(a1, a2);
        System.out.print("Subtracted value: ");
        diff.display();

        scanner.close();
    }
}


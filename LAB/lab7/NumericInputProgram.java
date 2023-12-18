import java.util.InputMismatchException;
import java.util.Scanner;

public class NumericInputProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a numeric value: ");
            //int numericInput = readNumericInput(scanner);
            int numericInput = scanner.nextInt();
            int numericInput2 = scanner.nextInt();
            System.out.println(numericInput/numericInput2);// divide by 0
            System.out.println("You entered: " + numericInput);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        }
        
        catch(ArithmeticException e)
        {
          System.out.println("swe cannot divide by 0");
        } 
        
        catch(Exception e)
        {
          System.out.println("some mistake happen");
        } 
        finally {
            scanner.close();
        }
    }

    /*private static int readNumericInput(Scanner scanner) 
    throws InputMismatchException {
        return scanner.nextInt();*/
    }
//}



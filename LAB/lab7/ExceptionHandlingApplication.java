import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingApplication {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int result = 5/5;//divideByZero();
            System.out.println("Result of division: " + result);

            // NullPointerException
            String nullString = "abcd";//null
            System.out.println("length of the string:"+nullString.length());
            //printStringLength(nullString);

            // ArrayIndexOutOfBoundsException
            int[] array = {1, 2, 3};
             System.out.println(array[2]);//array[5]
            //accessArrayElement(array, 5);

            // IOException
            readFromConsole();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            System.out.println("Application execution completed.");
        }
    }

   /* private static int divideByZero() {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;
    }

    private static void printStringLength(String str) {
        System.out.println("Length of the string: " + str.length());
    }

    private static void accessArrayElement(int[] array, int index) {
        System.out.println("Array element at index " + index + ": " + array[index]);
    }*/

    private static void readFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter something: ");
        String input = reader.readLine();
        System.out.println("You entered: " + input);
    }
}


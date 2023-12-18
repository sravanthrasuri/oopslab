import calculator.BasicCalculator;

public class appcalculator {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();

        // Example calculations
        double resultAdd = calculator.add(5.0, 3.0);
        double resultSubtract = calculator.subtract(8.0, 2.0);
        double resultMultiply = calculator.multiply(4.0, 6.0);
        double resultDivide = calculator.divide(9.0, 3.0);

        // Display results
        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSubtract);
        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
    }
}



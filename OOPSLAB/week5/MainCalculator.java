import calculator.BasicCalculator;
import calculator.CalculatorOperations;
public class MainCalculator {
    public static void main(String args[]){
        CalculatorOperations c=new BasicCalculator();
        System.out.println("add:"+c.add(5.2,6.3));
        System.out.println("subtract:"+c.sub(8.0,4.2));
        System.out.println("multiply:"+c.mul(8.0,4.2));
        System.out.println("divide:"+c.mul(8.0,4.0));
    }
}

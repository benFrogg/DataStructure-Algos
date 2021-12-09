
import java.util.*;

interface AdvancedArithmetic{
   public int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        ArrayList<Integer> container = new ArrayList<Integer>();
        int sum = 0;

        for (int i = 1; i <= (int)(Math.sqrt(n)); i++){
            if ((n % i) == 0) {
                container.add(i);
            }
        }

        for (int i : container){
            sum += i + n/i;
        }

        if (((int) (Math.sqrt(n)) * (int) (Math.sqrt(n))) == n) {
            sum -= Math.sqrt(n);
        }

        return sum;
    }
}

public class Day19Interfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}

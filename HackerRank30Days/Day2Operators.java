
import java.io.*;

class Result {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
        double result = (Math.round(((double)tip_percent/100)*(meal_cost)) + Math.round(((double)tax_percent/100)*(meal_cost)));
        System.out.println((int) (result + meal_cost));
    }
}

public class Day2Operators {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}

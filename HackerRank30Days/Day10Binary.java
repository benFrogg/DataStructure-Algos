
import java.io.*;

public class Day10Binary {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        int remainder = 0;
        int counter = 0;
        int finalRs = 0;

        while (n > 0){
            remainder = n % 2;
            n /= 2;

            if (remainder == 1){
                counter += 1;

                if (counter >= finalRs){
                    finalRs = counter;
                }
            } else {
                counter = 0;
            }
        }
        System.out.println(finalRs);
    }
}

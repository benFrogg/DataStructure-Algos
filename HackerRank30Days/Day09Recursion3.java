
import java.io.*;

class Result {
    public static int factorial(int n) {
        int finalRs = 0;

        if (n == 1)
        {
            finalRs = n;
        } else {
            finalRs = n * factorial(n-1);
        }

        return finalRs;
    }
}

public class Day9Recursion3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

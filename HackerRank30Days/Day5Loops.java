
import java.io.*;

public class Day5Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int numOfIterate = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

        for (int i = 1; i <= numOfIterate; i++)
        {
            int result = n * i;

            System.out.printf("%d x %d = %d%n", n, i, result);
        }
    }
}

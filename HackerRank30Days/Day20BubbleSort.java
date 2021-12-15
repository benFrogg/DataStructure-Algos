
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Day20BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Write your code here
        int counter = 0;

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1; j++) {
                if (a.get(j) > a.get(j + 1)){
                    Collections.swap(a, j, j + 1);
                    counter++;
                }
            }
        }

        System.out.printf("Array is sorted in %d swaps.%n", counter);
        System.out.printf("First Element: %d%n", a.get(0));
        System.out.printf("Last Element: %d%n", a.get(n - 1));


        bufferedReader.close();
    }
}

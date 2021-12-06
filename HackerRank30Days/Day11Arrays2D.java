
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Day11Arrays2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++)
        {
            for (int j = 0; j <= 3; j++)
            {
                int sum = 0;

                sum += arr.get(i).get(j);
                sum += arr.get(i).get(j+1);
                sum += arr.get(i).get(j+2);
                sum += arr.get(i+1).get(j+1);
                sum += arr.get(i+2).get(j);
                sum += arr.get(i+2).get(j+1);
                sum += arr.get(i+2).get(j+2);

                if (sum > max){
                    max = sum;
                }
            }
        }   
        
        System.out.println(max);
    }
}

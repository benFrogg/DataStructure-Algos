/*
Recursive Method for Calculating Factorial
factoral(N) = {1                N <= 1
               { N x factorial(N - 1) otherwise

Function Description
Complete the factorial function in the editor below. Be sure to use recursion.

factorial has the following parameter:
    - int n: an integer

Returns
    - int: the factorial of n

Note: if you fail to use recursion or fail to name your recursive functon factorial
or Factorial, you will score of 0.

Input Format
A single integer, n (the argument to pass to factorial).

Constraints
    - 2 <= n <= 12
    - Your submission must contain a recursive function named factorial.

Sample Input
3

Sample Output
6

Explanation
Consider the following steps. After the recursive calls from step 1 to 3, results are
accumulated from step 3 to 1.

    1. factorial(3) = 3 x factorial(2) = 3 x 2 = 6
    2. factorial(2) = 2 x factorial(1) = 2 x 1 = 2
    3. factorial(1) = 1
*/

import java.io.*;

class Result {
    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        // Write your code here
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

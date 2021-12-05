/*
Task 

Given the meal price (base cost of a meal), tip percent 
(the percentage of the meal price being added as tip), and tax percent
(the percentage of the meal price being added as tax) for a meal,
find and print the meal's total cost. Round the result to the nearest integer.

Example

meal_cost = 100
tip_percent = 15
tax_percent = 8

A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. 
Print the value 123 and return from the function.

Function Description

Complete the solve function in the editor below.
solve has the following parameters:
    - int meal_cost: the cost of food before tip and tax
    - int tip_percent: the tip percentage
    - int tax_percent: the tax percentage

The function returns nothing. Print the calculated value,
rounded to the nearest integer.

Note: Be sure to use precise values for your calculations,
or you may end up with incorrectly rounded result.

Input Format

There are 3 linnes of numeric input: 
The first line has double, meal_cost (the cost of the mea before tax and tip).
The second line has an integer, tip_percent (the percentage of meal_cost being added as tip).
The third line has an integer, tax_percent (the percentage of meal_cost being added as tax).

Sample Input
12.00
20
8

Sample Output
15

Explanation

Given:
meal_cost = 12, tip_percent = 20, tax_percent = 8

Calculations:
tip = 12 and 12/100 * 20 = 2.4
tax = 8 and 8/100 * 20 = 0.96
total_cost = meal_cost + tip + tax = 12 + 2.4 + 0.96 = 15.36
round(total_cost) = 15

We round total_cost to the nearest integer and print the result, 15.
*/

import java.io.*;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

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
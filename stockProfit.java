/*
The algorithm should find the profit made when you bought the stocks
to when you sell.

Example 1:
Input: 12, 45, 3, 15, 60, 23, 4
Output: [2, 4, 57]
*/

import java.util.*;

public class stockProfit {
    private static ArrayList<Integer> findProfit (int array[])
    {
        int min = array[0];
        int max = array[0];
        int minIndex = 0;
        int maxIndex = 0;
        int profit;

        // find max
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
                maxIndex = i;
            }
        }

        // find min
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
                minIndex = i;
            }
        }

        profit = max - min;

        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(minIndex);
        result.add(maxIndex);
        result.add(profit);
        
        return result;
    }
    
    public static void main(String [] args) throws Exception
    {
        int [] eg1 = {12, 45, 3, 15, 60, 23, 4};    // Expected output: [2, 4, 57]
        int [] eg2 = {5, 4, 3, 2, 1};               // Expected output: [4, 5, 1]

        ArrayList<Integer> profitArray = findProfit(eg1);
        ArrayList<Integer> profitArray2 = findProfit(eg2);
        
        System.out.println(profitArray);
        System.out.println(profitArray2);
    }
}

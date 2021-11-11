/*
Given an array of intgers, find the length of the longest sub-sequence 
such that elements in the subsequence are consecutive integers, the
consecutive numbers can be in any order.

Example 1:
    - Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
    - Output: 4
    - Explaination: The subsequence 1, 3, 4, 2 is the longest subsequence
                    of consecutive elements

Example 2:
    - Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
    - Output: 5
    - Explaination: 36, 35, 33, 34, 32 is the longest subsequence of
                    consecutive elements.
*/

import java.util.*;

public class consecutiveNumbers {

    // Naive approach O(nLogn)
    private static int NAIVEfindSubsequence(int arr[])
    {
        int totalChain = 0;
        int counter = 0;
        int n = arr.length;
        ArrayList <Integer> nonDups = new ArrayList<Integer>();

        // first sort the array given
        Arrays.sort(arr);

        // remove all duplicates
        if (n != 0 || n != 1)
        {
            for (int i = 0; i < n; i++)
            {
                nonDups.add(arr[i]);
            }
        }

        // Max length
        for (int i = 0; i < nonDups.size(); i++)
        {
            // Check if current element = previous element + 1
            if (i > 0 && nonDups.get(i) == nonDups.get(i - 1) + 1)
            {
                counter++;
            } else
            {
                counter = 1;
            }

            // Update max
            if (counter > totalChain)
            {
                totalChain = counter;
            }
        }

        return totalChain;
    }

    // Most efficient approach O(n)
    private static int MostEFFsubsequence(int arr[])
    {
        int totalChain = 0;

        HashSet<Integer> hashed = new HashSet<Integer>();

        int n = arr.length;

        // Remove duplicates using hash set
        for (int i = 0; i < n; i++)
        {
            hashed.add(arr[i]);
        }

        // Check the element first then move on next element
        for (int i = 0; i < n; ++i)
        {
            // Skip first element
            if (!hashed.contains(arr[i] - 1))
            {
                // Check next element, if hashed contains next element in orginal array we ++
                int next = arr[i];
                
                while (hashed.contains(next))
                {
                    next++;
                }

                // Update max
                if (totalChain < next - arr[i])
                {
                    totalChain = next - arr[i];
                }
            }
        }

        return totalChain;
    }

    
    public static void main (String [] args)
    {
        int [] eg1 = {1, 9, 3, 10, 4, 20, 2};
        int [] eg2 = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
        int [] dup = {1, 1, 2, 2};

        System.out.println(NAIVEfindSubsequence(eg1));
        System.out.println(NAIVEfindSubsequence(eg2));
        System.out.println(NAIVEfindSubsequence(dup));

        System.out.println();
        System.out.println(MostEFFsubsequence(eg1));
        System.out.println(MostEFFsubsequence(eg2));
        System.out.println(MostEFFsubsequence(dup));
    }
}

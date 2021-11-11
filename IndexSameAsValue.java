
/*
Check the total number in the array is the same as it's index

Example 1:
    - Input: {3, 7, 2, 1, 9, 5}
    - Output: 2

Example 2:
    - Input: {0, 4, 2, 3, 9, 5, 7}
    - Output: 4
*/


public class IndexSameAsValue {
    private static int sameIndex(int array[])
    {
        int finalVal = 0;

        int n = array.length;

        for (int i = 0; i < n; i++)
        {
            if (array[i] == i)
            {
                finalVal++;
            }
        }

        return finalVal; 
    }

    public static void main (String [] args)
    {
        int [] eg1 = {3, 7, 2, 1, 9, 5};
        int [] eg2 = {0, 4, 2, 3, 9, 5, 7};

        System.out.println(sameIndex(eg1));
        System.out.println(sameIndex(eg2));
    }
}

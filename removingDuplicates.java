
import java.util.*;

public class removingDuplicates {
    private static int remove(int arr[])
    {
        Arrays.sort(arr);

        int n = arr.length;

        if (n == 0 || n == 1)
        {
            return n;
        }

        // Next index
        int next = 0;

        for (int i = 0; i < n - 1; i++)
        {
            if (arr[i] != arr[i + 1])
            {
                arr[next++] = arr[i];
            }
        }

        arr[next++] = arr[n - 1];

        return next;
    }

    public static void main (String [] args)
    {
        int arr[] = {1, 1, 2, 3, 3, 4, 1, 5};

        int newArray = remove(arr);

        for (int i = 0; i < newArray; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

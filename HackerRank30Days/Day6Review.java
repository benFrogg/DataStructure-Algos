
import java.util.*;

public class Day6Review {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scanIndex = input.nextInt();

        for (int j = 0; j < scanIndex; j++)
        {
            String s = input.next();
            List<String> sList = new ArrayList<String>(Arrays.asList(s.split("")));
            String odd = "";
            String even = "";

            for (int i = 0; i < sList.size(); i++)
            {
                if (i == 0)
                {
                    even = even + sList.get(i);
                } else if (i % 2 != 0)
                {
                    odd = odd + sList.get(i);
                } else if (i % 2 == 0)
                {
                    even = even + sList.get(i);
                }
            }
            System.out.printf("%s %s%n", even, odd);
        }
        input.close();
    }
}




public class countAppear {
    private static int countWords(String str, String substring)
    {
        int counter = 0;

        // Split the string into letters
        String splitArray[] = str.split(" ");

        for (int i = 0; i < splitArray.length; i++)
        {
            if (substring.equals(splitArray[i]))
            {
                counter++;
            }
        }

        return counter;
    }

    public static void main (String [] args)
    {
        String str = "The sentence given is the sentence here";
        String substring = "sentence";
        System.out.println(countWords(str, substring));
    }
}

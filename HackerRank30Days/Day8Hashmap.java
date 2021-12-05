
import java.util.*;

public class Day8Hashmap {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Hashtable <String, Integer> dict = new Hashtable <String, Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            dict.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (dict.containsKey(s))
            {
                System.out.printf("%s=%d%n",s, dict.get(s));
            } else {
                System.out.println("Not found");
            }
        } 
        in.close();
    }
}

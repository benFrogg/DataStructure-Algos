
import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int [] arr){
        this.elements = arr;
    }

    public int computeDifference(){
        int result = 0;
        maximumDifference = Integer.MIN_VALUE;
        for (int i = 0; i < elements.length; i++){
            for (int j = elements.length - 1; j >= 0; j--){
                result = elements[i] - elements[j];

                if (result > maximumDifference){
                    maximumDifference = result;
                }
            }
        }
        return maximumDifference;
    }
}

public class Day14Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

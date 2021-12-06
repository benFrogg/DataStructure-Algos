

import java.io.*;
import java.util.Scanner;

public class Day1DataType {

    public static void main (String [] args)
    {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner input = new Scanner (System.in);
        System.out.println("Int");
        int inputInt = input.nextInt();
        System.out.println("Double");
        double inputDouble = input.nextDouble();
        System.out.println("String");
        input.nextLine();
        String inputStr = input.nextLine();
        
        input.close();

        int finalI = i + inputInt;
        double finalD = d + inputDouble;
        String finalS = s + inputStr;


        System.out.println(finalI);
        System.out.println(finalD);
        System.out.println(finalS);
    }
}

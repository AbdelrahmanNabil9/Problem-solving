import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sum = sc.next();
        sum= sum.replace("+","");
        char [] arr= sum.toCharArray();
        Arrays.sort(arr);
       // System.out.println(arr);
        for (int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i]);
            if(i == arr.length-1)
                continue;
            System.out.print("+");
        }
        System.out.println();

    }

}
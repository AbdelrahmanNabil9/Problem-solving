import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str= str.toLowerCase(Locale.ROOT);
        str = str.replaceAll("[aeiouy]", "");
        char [] arr = str.toCharArray();

        for (int i=0; i< arr.length; i++){
            System.out.print(".");
            System.out.print(arr[i]);
        }
        System.out.println();

    }
}
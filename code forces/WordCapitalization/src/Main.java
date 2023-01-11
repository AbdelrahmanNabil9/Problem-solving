import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char [] arr= s.toCharArray();
        arr[0]=Character.toUpperCase(arr[0]);
        for (int i =0;i< arr.length;i++)
            System.out.print(arr[i]);
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int  i =1; i <= n; i++){
            if (i %2 !=0){
                arr.add(i);
            }
        }
        for (int  i =1; i <= n; i++){
            if (i %2 ==0){
                arr.add(i);
            }
        }

        System.out.println(arr.get(k-1));
    }
}
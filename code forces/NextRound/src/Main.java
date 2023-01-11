import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] a= new int[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        k = a[k - 1];
        for (int i = 0; i < n; i++) {
            if (a[i] >= k && a[i] > 0)
                count++;
            else
                break;
        }
        System.out.println(count);
    }
}
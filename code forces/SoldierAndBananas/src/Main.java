import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();
        int n = sc.nextInt();
        int w= sc.nextInt();
        int price= k;

        for (int i =2; i<=w; i++){
            price+= i*k;
        }
        int borrow =0;

        if (price <= n) {
            System.out.println(0);
            System.exit(0);
        }
            System.out.println(price-n);
    }
}
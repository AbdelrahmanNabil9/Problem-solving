import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();

        while (t > 0){
            int ctr = 0;
            int n =sc.nextInt();
            int [] arr = new int[n];

            for (int i=0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            for (int j=0; j < n; j++){
                if (j==0 && arr[0] < arr[1] ) ctr++;
                else if (j!=0  && j!=n-1 && arr[j] < arr[j-1] && arr[j] < arr[j+1] ) {
                    ctr++;
                } else if (j == n - 1 && arr[j] < arr[j - 1]) {
                    ctr++;
                } else if (j!=0 && arr[j] == arr[j-1]) {
                    continue;
                }

                System.out.println("...." + ctr);
            }
            System.out.println(ctr);
            if (ctr == 1) System.out.println("yes");
            else System.out.println("no");
            t--;
        }
    }
}
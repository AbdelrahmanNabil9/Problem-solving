import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i<t; i++) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            String str = sc.next();
            int indexInAlpha=(alpha.indexOf(str.charAt(0)))+1;

            for (int j =1; j<n; j++){
                arr[j]=(alpha.indexOf(str.charAt(j)))+1;
                if(arr[j] > indexInAlpha)
                    indexInAlpha = arr[j];
            }
            System.out.println(indexInAlpha);
        }
    }
}*
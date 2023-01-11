import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {

            String str= sc.next();
            if (str.length()<= 10) {
                System.out.println(str);
            }
                else
                System.out.println(str.charAt(0)+ "" + (str.length()-2)+ "" + str.charAt(str.length()-1));
        }
    }
}
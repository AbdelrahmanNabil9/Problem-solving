import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[5][5];
        int numOfMoves = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                array[i][j] = sc.nextInt();

                if (array[i][j] == 1) {
                    numOfMoves = Math.abs(i - 2) + Math.abs(j - 2);
                }
            }
        }
        System.out.println(numOfMoves);

    }
}

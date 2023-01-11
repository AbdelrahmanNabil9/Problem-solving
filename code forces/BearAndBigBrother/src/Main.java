import java.util.Scanner;
import java.util.stream.IntStream;

        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int limak=sc.nextInt();
                int bob=sc.nextInt();
                int ctr=0;
                while(limak<=bob){
                    limak=limak*3;
                    bob=bob*2;
                    ctr++;
                }
                System.out.println(ctr);

            }
        }
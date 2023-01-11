import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 0) {

            int numOfParticipants = sc.nextInt();
            int [] participants= new int[numOfParticipants];
            int [] unSortedparticipants= new int[numOfParticipants];
            int max = 0;

            for (int i = 0; i < numOfParticipants; i++){
                int participant = sc.nextInt();
                participants[i] = participant;
                unSortedparticipants[i] = participants[i];
                if (participants[i] > max){
                  max = participants[i];
                }
            }
            Arrays.sort(participants);

            for(int j = 0 ; j < participants.length; j++){
                if (unSortedparticipants[j] == max){
                    System.out.print(unSortedparticipants[j] - participants[participants.length-2] + " ");
                }
                else
                    System.out.print(unSortedparticipants[j] - max + " ");
            }
            n--;
            System.out.println("");
        }
    }
}
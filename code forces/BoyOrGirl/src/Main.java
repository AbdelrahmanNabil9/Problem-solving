import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    if (s.chars().distinct().count() %2==0){
        System.out.println("CHAT WITH HER!");
    }
    else
        System.out.println("IGNORE HIM!");
    }
}
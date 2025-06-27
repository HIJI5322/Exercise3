import java.util.Random;
import java.util.Scanner;

public class dicegame {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int val1 = 0;
        int val2 = 0;
        int total = 0;

        val1 = rand.nextInt(6) + 1;
        val2 = rand.nextInt(6) + 1;
        total = val1 + val2;

        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Die 1: " + val1);
        System.out.println("Die 2: " + val2);
        System.out.println("Total value: " + total);
    }
}

// Java program to take input as Amount in rupees and print their denominations and total number of notes
import java.util.Scanner;

public class Denomination {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int amount, total = 0;

            System.out.println("Enter amount:");
            amount = sc.nextInt();

            int notes[] = {500, 200, 100, 50, 20, 10};

            for(int i = 0; i < notes.length; i++) {
                int count = amount / notes[i];
                if(count != 0) {
                    System.out.println(notes[i] + " notes = " + count);
                    total = total + count;
                    amount = amount % notes[i];
                }
            }

            System.out.println("Total notes = " + total);
        }
    }
}

// Java program to take input as Integer array and print even indexed even numbers and odd indexed odd numbers
import java.util.Scanner;

public class ArrayCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a[] = new int[5];

            System.out.println("Enter 5 elements:");
            for(int i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("Required elements are:");
            for(int i = 0; i < 5; i++) {
                if(i % 2 == 0 && a[i] % 2 == 0)
                    System.out.println(a[i]);
                else if(i % 2 != 0 && a[i] % 2 != 0)
                    System.out.println(a[i]);
            }
        }
    }
}

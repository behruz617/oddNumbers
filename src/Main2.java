import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int total = 0;
        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            if (number % 4 == 0) {
                total += number;
            }
        } while (number > 0);
        System.out.println("Sum of numbers that are multiples of four: " + total);
    }
    }


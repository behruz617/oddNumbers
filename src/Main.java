import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.print("Enter the number ");
            int number = sc.nextInt();
            if (number < 0) {
                break;
            }
            if (number % 2 == 1) {
                total += number;
            }

        }System.out.println("The total number "+total);

        /*

        OR
          do {
            System.out.print("Enter the number ");
             number = sc.nextInt();
            if (number % 2 == 1) {
                total += number;
            }
        }while (number>0);
            System.out.println("The total number "+total);



         */
    }
}

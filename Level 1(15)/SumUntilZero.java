import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Enter numbers to sum (enter 0 to stop):");
        double number = scanner.nextDouble();

        while (number != 0) {
            total += number;
            number = scanner.nextDouble();
        }

        System.out.println("Total sum: " + total);
        scanner.close();
    }
}

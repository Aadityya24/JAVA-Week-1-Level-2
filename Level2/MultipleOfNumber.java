import java.util.Scanner;

public class MultipleOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Print multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100:");

        // Loop from 100 down to 1
        for (int i = 99; i >= 1; i--) {  // 99 is the highest number < 100
            if (i % number == 0) {  // Check if 'i' is a multiple of 'number'
                System.out.println(i);
            }
        }
    }
}

import java.util.Scanner;
public class GreatestFactor{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number");
		int number = scanner.nextInt();
		scanner.close();
		
		int greatestFactor = 1;
		
		// Edge case: No proper factor for numbers <= 1
        if (number <= 1) {
            System.out.println("No greatest proper factor exists for " + number);
            return;
        }
		
		for (int i = number-1; i >= 1; i--) {
			//using conditional statment to check divisiblity
			if (number % i == 0){
				greatestFactor = i;
				break;
			}
		}
		//display greatest factor outside loop
		System.out.println("The greatest factor of " + number + " is " + greatestFactor);
	}
}
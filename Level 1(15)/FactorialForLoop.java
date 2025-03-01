import java.util.Scanner;
public class FactorialForLoop{
	public static void main(String[] args){
		Scanner scannr = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = scannr.nextInt();
		
		scannr.close();
		
		if (number < 0) {
			System.out.println("The number is invalid. Enter positive integer");
		} else {
			int factorial = 1;
			
			for (int i = 1; i <= number; i++) {
				factorial *= i;
			}
			System.out.println("The factorial of given number is : " + factorial);
		}
	}
}	
import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		Scanner scannr = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = scannr.nextInt();
		
		scannr.close();
		
		if (number < 0) {
			System.out.println("The number is invalid. Enter positive integer");
		} else {
			int i = 1;
			int factorial = 1;
			while (i <= number){
				factorial *= i;
				i++;
			}
			System.out.println("The factorial of given number is " + factorial);
		}
	}
}
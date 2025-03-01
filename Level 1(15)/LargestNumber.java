import java.util.Scanner;
public class LargestNumber{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		double number1 = scanner.nextDouble();
		
		System.out.println("Enter second number:");
		double number2 = scanner.nextDouble();
		
		System.out.println("Enter the tird number:");
		double number3 = scanner.nextDouble();
		
		scanner.close();
		
		if (number1 > number2 && number1 > number3){
			System.out.println("The first number is the largest number");
		}else if (number2 > number1 && number2 > number3){
			System.out.println("The second number is the largest number");
		} else if(number3 > number1 && number3> number2) {
			System.out.println("The third number is the largest number");
		} else {
			System.out.println("Two or more numbers are equal");
		}
	}
}
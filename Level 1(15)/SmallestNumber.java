import java.util.Scanner;
public class SmallestNumber{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		double number1 = scanner.nextDouble();
		
		System.out.println("Enter number 2:");
		double number2 = scanner.nextDouble();
		
		System.out.println("Enter number 3:");
		double number3 = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println("Is first number the smallest:");
		
		
		if (number1 < number2 && number1 < number3){
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}
}

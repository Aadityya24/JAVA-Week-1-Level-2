import java.util.Scanner;
public class PowerOfNumber{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int number = scanner.nextInt();
		
		System.out.print("Enter the power");
		int power = scanner.nextInt();
		scanner.close();
		
		 // Initialize result to 1 
		int result = 1;
		 // Loop to multiply 'number' by itself 'power' times
		for(int i = 1; i <= power; i++) {
			result*= number;	
		}
		System.out.println("Result is " + result);
	}
}
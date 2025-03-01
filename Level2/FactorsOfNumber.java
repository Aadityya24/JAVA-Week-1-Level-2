import java.util.Scanner;
public class FactorsOfNumber{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		scanner.close();
		
		for (int i = 1; i < number; i++) {
			// conditional statment to check divisiblity
			if (number % i == 0){
				System.out.println(i);	
			}
		}
	}
}
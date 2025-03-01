import java.util.Scanner;
public class SumOfNumbers{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		double total = 0;
		double number;
		
		System.out.println("Enter a number to add (0 to stop)");
		
		while (true) {
			number = scanner.nextDouble();
			if (number <= 0){
				break;
			}
			total += number;
		}
		scanner.close();
		System.out.println(total);
	}
}
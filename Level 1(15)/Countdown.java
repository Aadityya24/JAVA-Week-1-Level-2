import java.util.Scanner;
public class Countdown{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number for countdown:");
		int number = scanner.nextInt();
		
		scanner.close();
		
		while (number > 0){
			System.out.println( number );
			number--;
		}
	}
}
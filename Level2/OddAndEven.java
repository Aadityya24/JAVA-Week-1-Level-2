import java.util.Scanner;
public class OddAndEven{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		int number = scanner.nextInt();
		
		scanner.close();
		
		if(number < 1){
			System.out.println("This is not a valid integer.");
		}  else {
			for (int i = 1; i <= number; i++) {
				
				int evenOdd = i % 2;
				if (evenOdd == 0) {
					System.out.println("The number " +i +" is an even number");
				} else {
					System.out.println("The number " + i + " is an odd number");
				}
			}
		}
		
	}
}
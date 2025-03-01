import java.util.Scanner;
public class SumOfNaturalNumbersForLoop{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		
		scanner.close();
		
		if (number >= 1) {
			int	sumLoop = 0;
			
			for (int i = 1; i <= number; i++){
				sumLoop += i;
			}
			int sumFormula = number * (number+1)/2;
			
			System.out.println("The sum using formula:" + sumFormula);
			System.out.println("The sum using loop is :" + sumLoop);
			
			if (sumFormula == sumLoop) {
				System.out.println("Both calculation match each other");
			} else {
				System.out.println("There is an calculation error");
			}
		} else {
			System.out.println("The number is not a natural number");
		}
	}
}
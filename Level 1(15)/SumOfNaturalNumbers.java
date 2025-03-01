import java.util.Scanner;
public class SumOfNaturalNumbers{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		
		scanner.close();
		
		if (number < 1) {
			System.out.println("The number is not a natural number");
		} else {
			int sumWhileLoop = 0;
			int i = 1;
			while (i <= number) {
				sumWhileLoop += i;
				i++;
			}
			int sumFormula = number * (number+1)/2;
			
			System.out.println("The sum using loop is " + sumWhileLoop);
			System.out.println("The sum using the formula is " + sumFormula);
			
			if (sumFormula == sumWhileLoop){
				System.out.println("Boath calculation match each other");
			} else {
				System.out.println("There is an error in claculation");
			}
		}
		
		
	}
}
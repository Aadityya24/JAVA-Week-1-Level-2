import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		//taking input from user
		System.out.print("Enter a number between 6 to 9:");
		int number = scanner.nextInt();
		 scanner.close();
		 
		//creating a if else statement to check number between 6-9 
		if (number < 6 || number > 9) {
			System.out.println("Enter a valid number");
		} else {
			//creating a for loop to print multiplication table
			for (int i = 1; i <= 10; i++) {
				int product = number * i;
				System.out.println(number + "*" + i + "=" + product);
			}
		}
	}
}
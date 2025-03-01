import java.util.Scanner;
public class NumberSigns{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		
		scanner.close();
		
		if(number > 0){
			System.out.println("The number " + number + " is a positive number");
		}else if ( number < 0){
			System.out.println("The number " + number + " is negative number");
		}else{
			System.out.println("The number is zero");
		}
	}
}
import java.util.Scanner;
public class NatralNumbers{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		
		scanner.close();
		
		if(number >= 0 ){
			int sum = number * (number+1)/2;
			System.out.println("The sum of " + number + " natural number is " + sum);
		}else{
			System.out.println("The number " + number + " is not a natural number");
		}
	}
}
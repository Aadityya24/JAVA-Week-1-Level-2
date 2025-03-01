import java.util.Scanner;
public class Divisiblity{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		
		scanner.close();
		
		int modulus= number % 5;
		
		System.out.println("Is " + number+ " divisible by 5?");
		
		if (modulus == 0){
			System.out.println("yes");
		} else{
			System.out.println("No");
		}
		}
	}

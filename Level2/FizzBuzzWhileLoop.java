import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a positive integer:");
		int number = scanner.nextInt();
		scanner.close();
		
		int i =0;
		while (i <= number) {
			// using conditional statement to check divisiblity and print fizz and buzz
			if(i == 0){
				System.out.println(i);
			}
			else if (i % 3 == 0 && i % 5 == 0) {
			    System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0){
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
			i++;
		}
	}
}
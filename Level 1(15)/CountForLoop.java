import java.util.Scanner;
public class CountForLoop{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number for countdown:");
		int number = scanner.nextInt();
		
		scanner.close();
		
		for (int i = number; i > 0; i--) {
			System.out.println(i);
		}
	}
}
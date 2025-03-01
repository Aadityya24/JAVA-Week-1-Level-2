import java.util.Scanner;
public class VoterEligibility{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		
		scanner.close();
		
		if(age >= 18){
			System.out.println("The persons age is " + age + " and can vote");
		}else{
			System.out.println("The persons age is " + age + " and cannot vote");
		}
	}
}
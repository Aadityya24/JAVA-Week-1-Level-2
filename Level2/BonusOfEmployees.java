import java.util.Scanner;
public class BonusOfEmployees{
	public static void main(String[] args){
		Scanner scaner = new Scanner(System.in);
		
		//taking service year input
		System.out.println("Enter total number of service year:");
		int year = scaner.nextInt();
		
		//creating if loop to make sure bonus is given to employees worked more than 5 years
		if (year < 5) {
			System.out.println("Sorry, you worked less than 5 years");
		} else {
			//taking salary input
		System.out.println("Enter your salary:");
		double salary = scaner.nextDouble();
		
		//calculating bonus
		double bonus = 0.05 * salary;
		
		System.out.println("your bonus amount is " + bonus);
		}			
	}
}
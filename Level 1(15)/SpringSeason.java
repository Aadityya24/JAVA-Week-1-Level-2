import java.util.Scanner;
public class SpringSeason{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the month number:");
		int month = scanner.nextInt();
		
		System.out.println("Enter the day:");
		int day = scanner.nextInt();
		
		scanner.close();
		
		if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid input! Please enter a valid month (1-12) and day (1-31).");
            return;
        }
		
		boolean spring = (month == 3 && day >= 20) ||
						 (month == 4) || (month == 5) ||
						 (month == 6 && day <= 20);
						 
		if (spring) {
			System.out.println("It is spring season");
		} else {
			System.out.println("It is not spring season");
		}
	}
}
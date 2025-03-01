import java.util.Scanner;
public class YoungestFriends{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Amar's age:");
		int amarAge = scanner.nextInt();
		
		System.out.print("Enter Akbar's age:");
		int akbarAge = scanner.nextInt();
		
		System.out.print("Enter Anthony's age:");
		int anthonyAge = scanner.nextInt();
		
		System.out.print("Enter Amar's hight:");
		int amarHight = scanner.nextInt();
		
		System.out.print("Enter Akbar's hight:");
		int akbarHight = scanner.nextInt();
		
		System.out.print("Enter Anthony's hight:");
		int anthonyHight = scanner.nextInt();
		  scanner.close();
		  
		//Applying condition statment to check youngest
		if (amarAge < akbarAge && amarAge < anthonyAge) {
			System.out.println("Amar is youngest");
		} else if (akbarAge < amarAge && akbarAge < anthonyAge) {
			System.out.println("Akbar is youngest");
		} else {
			System.out.println("Anthony is youngest");
		}
		
		//Applying condition statment to check tallest
		if (amarHight > akbarHight && amarHight > anthonyHight) {
			System.out.println("Amar is tallest");
		} else if (akbarHight > amarHight && akbarHight > anthonyHight) {
			System.out.println("Akbar is tallest");
		} else {
			System.out.println("Anthony is tallest");
		}
		
	}
}
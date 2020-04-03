// Import the Scanner class
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner scan = new Scanner(System.in);
		
		// Read user input
		System.out.println("Enter username");
		String userName = scan.nextLine(); 
		
		// Output user input
		System.out.println("Username is: " + userName); 
		
		// Close the scanner object
		scan.close();
	}
}

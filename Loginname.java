import java.util.Scanner;

public class Loginname {

	public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);

      
        String input = scnr.nextLine();

        // Split the input string into an array of strings using space (" ") as the delimiter
String[] parts = input.split(" ");

// Extract the first name from the 'parts' array
String firstName = parts[0];

// Extract the last name from the 'parts' array
String lastName = parts[1];

// Extract the four-digit number from the 'parts' array and convert it to an integer
int number = Integer.parseInt(parts[2]);

        // Get first six letters of the first name (or all letters if less than six)
        String firstPart = firstName.substring(0, Math.min(firstName.length(), 6));

        // Get first letter of the last name
        char lastInitial = lastName.charAt(0);

        // Get last digit of the number
        int lastDigit = number % 10;

        // Combine the parts to form the login name
        String loginName = firstPart + lastInitial + "_" + lastDigit;

        // Output the login name
        System.out.println("Your login name: " + loginName);

        // Close the scanner
        scnr.close();

	}
}
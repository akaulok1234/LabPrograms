import java.util.Scanner;

public class nameformat {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String fullName = scnr.nextLine();

        // Split the full name into individual names
        String[] names = fullName.split(" ");

        // Extract the last name
        String lastName = names[names.length - 1];

        // Initialize the first and middle initials
        String firstInitial = String.valueOf(names[0].charAt(0));
        String middleInitial = "";

        // Check if there is a middle name
        if (names.length > 2) {
            // Extract the middle initial
            middleInitial = String.valueOf(names[1].charAt(0)) + ".";
        }

        // Print the formatted name: lastName, firstInitial middleInitial
        System.out.println(lastName + ", " + firstInitial+"." + middleInitial);
    }
}
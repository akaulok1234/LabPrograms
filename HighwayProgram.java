import java.util.Scanner;

public class HighwayProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highwayNumber;
        int primaryNumber;

        System.out.print("Enter a highway number: ");
        highwayNumber = scanner.nextInt();
        primaryNumber = highwayNumber % 100;

        // Check if the highway number is within the valid range (1-99)
        if (highwayNumber >= 1 && highwayNumber <= 99) {
            // Check if the highway number is odd or even to determine the direction
            if (highwayNumber % 2 == 1) {
                System.out.println("I-" + highwayNumber + " is primary, going north/south.");
            } else {
                System.out.println("I-" + highwayNumber + " is primary, going east/west.");
            }
        }
        // Check if the highway number is within the valid range (100-999)
        else if (highwayNumber >= 100 && highwayNumber <= 999) {
            // Check if the primary number is not zero
            if (primaryNumber != 0) {
                // Check if the primary number is odd or even to determine the direction
                if (primaryNumber % 2 == 1) {
                    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going north/south.");
                } else {
                    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going east/west.");
                }
            } else {
                System.out.println(highwayNumber + " is not a valid interstate highway number.");
            }
        }
        // Handle invalid highway numbers
        else {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }
    }
}
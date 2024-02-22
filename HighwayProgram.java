import java.util.Scanner;

public class HighwayProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highwayNumber;
        int primaryNumber;

        System.out.print("Enter a highway number: ");
        highwayNumber = scanner.nextInt();
        primaryNumber = highwayNumber % 100;

        if (highwayNumber >= 1 && highwayNumber <= 99) {
            if (highwayNumber % 2 == 1) {
                System.out.println("I-" + highwayNumber + " is primary, going north/south.");
            } else {
                System.out.println("I-" + highwayNumber + " is primary, going east/west.");
            }
        } else if (highwayNumber >= 100 && highwayNumber <= 999) {
            if (primaryNumber != 0) {
                if (primaryNumber % 2 == 1) {
                    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going north/south.");
                } else {
                    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going east/west.");
                }
            } else {
                System.out.println(highwayNumber + " is not a valid interstate highway number.");
            }
        } else {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }
    }
}
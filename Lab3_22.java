import java.util.Scanner;

public class Lab3_22 {
   public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scnr = new Scanner(System.in);
      
        // Prompt the user to enter three integers
        System.out.print("Enter three integers: ");
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();
          
        // Find the smallest number among the three
        if (num1 <= num2 && num1 <= num3) {
            System.out.print(num1); // num1 is the smallest
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.print(num2); // num2 is the smallest
        } else {
            System.out.print(num3); // num3 is the smallest
        }
   }
}
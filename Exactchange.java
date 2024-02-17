import java.util.Scanner; 

public class Exactchange {
   public static void main(String[] args) {
         // Get input from the user
        Scanner scanner = new Scanner(System.in);
       
        int changeInPennies = scanner.nextInt();

        // Calculate and print the change
        if (changeInPennies == 0) {
            System.out.println("No change");
        } else {
           //Array to store the coinvalues index 0 - 4 , corresponding to the CoinNmaes 
            int[] coinValues = { 100, 25, 10, 5, 1 };
            String[] coinNames = { "Dollar", "Quarter", "Dime", "Nickel", "Penny" };
        
            for (int i = 0; i < coinValues.length; i++) {
                int numCoins = changeInPennies / coinValues[i];
                if (numCoins > 0) {
                    if (numCoins > 1) {
                       // plural incase its more than one.
                        coinNames[i] += "s";
                    }
                    System.out.println(numCoins + " " + coinNames[i]);
                    changeInPennies %= coinValues[i];
                }
            }
        }
   }
}
import java.util.Scanner;
public class ChocolateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.println("How many dollars would you like to spend on chocolate from the vending machine?");
        int dollars = input.nextInt();

        // Returns error message if user enters invalid input
        if (dollars < 0) {
            System.out.println("Invalid value for amount. Exiting the program!");
            return;
        }

        int totalChocolates = dollars; // Each dollar buys one chocolate
        int coupons = dollars;         // Each chocolate gives one coupon

        // Redeem coupons while possible
        while (coupons >= 6) {
            int newChocolates = (coupons / 6);   // Redeemable chocolate bars
            totalChocolates += newChocolates;  // Add to total
            coupons = (coupons % 6) + newChocolates; // Remainder and new coupons from redeemed chocolates
        }

        // Final output
        System.out.println("You can buy " + totalChocolates + " chocolate bars and will have " + coupons + " coupons left!");
    }
}

//Abby Dycus Lab Section 003
import java.util.Scanner;
public class StockCalculator {

    public static void main(String[] args) {

        //creates scanner for user input
        Scanner key = new Scanner(System.in);

        System.out.println("Welcome to the Stock Transaction Program!");

        //stores user input for initial price in double initialPrice
        System.out.println("What was initial price per share when you purchased the stock:");
        double initialPrice = key.nextDouble();

        //stores user input for shares purchase in double sharesPurchased
        System.out.println("How many shares did you purchase?");
        double sharesPurchased = key.nextDouble();

        //calculates the total cost of the stock, stored in double totalCost, and commission when stock was purchased, stored in double purchaseCommission
        double totalCost = (initialPrice * sharesPurchased);
        double purchaseCommission = (totalCost * 0.02);



        //returns error message if user inputs invalid value (less than 0)
        if (initialPrice < 0) {
            System.out.println("Error: initial price cannot be less than 0");
            return;
        }

        //returns error message if user inputs invalid value (less than 0)
        if (sharesPurchased < 0) {
            System.out.println("Error: amount of shares purchased cannot be less than 0");
            return;
        }

        //Displays the total cost and commission paid during purchase
        System.out.println("Total cost for all shares purchased = " + totalCost);
        System.out.println("Commission paid to stockbroker during purchase = " + purchaseCommission);

        //stores user input for stock price when sold in double soldPrice
        System.out.println("What was the price per share when selling the stock?");
        double soldPrice = key.nextDouble();

        //stores user input for amount of shares sold in double sharesSold
        System.out.println("How many shares are you selling");
        double sharesSold = key.nextDouble();

        //calculates the total sale of the stock, stored in double totalSale, and commission when stock was sold, stored in double salesCommission
        double totalSale = (soldPrice * sharesSold);
        double saleCommission = (totalSale * 0.02);

        //returns error message if user inputs invalid value (less than 0)
        if (soldPrice < 0) {
            System.out.println("Error: share sell price cannot be less than 0");
            return;
        }

        //returns error message if user inputs invalid value (less than 0)
        if (sharesSold < 0) {
            System.out.println("Error: amounts of shares sold cannot be less than 0");
            return;
        }

        //returns error message if user inputs invalid value (# of shares sold is higher than shares purchased)
        if (sharesSold > sharesPurchased) {
            System.out.println("Error: number of shares sold cannot be higher than shares purchased");
        }

        //Displays the total sale and commission paid during sale
        System.out.println("Total sale amount = " + totalSale);
        System.out.println("Commission paid to stockbroker during sale = " + saleCommission);

        //calculates profit when amount of shares purchased is equal to shares sold
        if (sharesPurchased == sharesSold) {
            double profitOrLoss = (totalSale - (totalCost + purchaseCommission + saleCommission));
            //if else statement outputs message depending on whether user profited or lost money
            if (profitOrLoss > 0) {
                System.out.println("User made a profit of $" + profitOrLoss + " on the stock sale");
            }
                else {
                    System.out.println("User made a loss of $" + profitOrLoss + " on the stock sale");
                }
        }

        //calculates profit when amount of shares purchased is greater than shares sold
        if (sharesPurchased > sharesSold) {
            double profitOrLoss = (totalSale - (((initialPrice * sharesSold) + purchaseCommission) + saleCommission));
            //if else statement outputs message depending on whether user profited or lost money
            if (profitOrLoss > 0) {
                System.out.println("User made a profit of $" + profitOrLoss + " on the stock sale");
            }
            else {
                System.out.println("User made a loss of $" + profitOrLoss + " on the stock sale");
            }
        }

    }
}
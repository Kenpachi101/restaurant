/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;
import java.util.Scanner;
/**
 *
 * @author students
 */
public class Restaurant {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // create a menu
        String[] menuItems = {"Burger", "Pizza", "Chipo", "Soda", "Water"};
        double[] menuPrices = {300.0, 500.0, 80.0, 110.0, 30.0};
        
        // display the menu
        System.out.println("Welcome to our restaurant! Here is our menu:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i+1) + ". " + menuItems[i] + ": ksh" + menuPrices[i]);
        }
        
        // allow user to add an item to the menu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add an item to the menu? (yes/no)");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Please enter the name of the item:");
            String newItem = scanner.nextLine();
            System.out.println("Please enter the price of the item:");
            double newPrice = scanner.nextDouble();
            
            String[] newMenuItems = new String[menuItems.length + 1];
            double[] newMenuPrices = new double[menuPrices.length + 1];
            
            for (int i = 0; i < menuItems.length; i++) {
                newMenuItems[i] = menuItems[i];
                newMenuPrices[i] = menuPrices[i];
            }
            
            newMenuItems[newMenuItems.length-1] = newItem;
            newMenuPrices[newMenuPrices.length-1] = newPrice;
            
            menuItems = newMenuItems;
            menuPrices = newMenuPrices;
        }
        
        // take the user's order
        System.out.println("Please enter the number of the item you would like to order:");
        int itemNumber = scanner.nextInt();
        System.out.println("Please enter the quantity:");
        int quantity = scanner.nextInt();
        
        // calculate the total cost
        double cost = menuPrices[itemNumber-1] * quantity;
        
        // prompt user to enter mobile money number and make payment
        System.out.println("Your total cost is Ksh" + cost + ". Please enter your mobile money number:");
        String mobileMoneyNumber = scanner.nextLine(); // read the newline character
        mobileMoneyNumber = scanner.nextLine(); // read the actual input
        System.out.println("You have made a payment of $" + cost + " from mobile money number " + mobileMoneyNumber + ".");
    }
    
}

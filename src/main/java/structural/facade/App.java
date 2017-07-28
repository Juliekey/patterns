package structural.facade;

import structural.facade.entities.Customer;
import structural.facade.entities.Waiter;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        System.out.println("Hello! I'll be your waiter today. What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Customer customer = new Customer(name);
        System.out.println("Hello " + name
                + ". What appetizer would you like?");
        int appID = Integer.valueOf(scanner.nextLine());
        System.out.println("That's a good one. What entree would you like?");
        int entreeID = Integer.valueOf(scanner.nextLine());
        System.out.println("A great choice! Finally, what drink would you like?");
        int drinkID = Integer.valueOf(scanner.nextLine());
        System.out.println("I'll get that order in right away.");
        //Here's what the Facade simplifies
        waiter.placeOrder(customer, appID, entreeID, drinkID);
    }
}

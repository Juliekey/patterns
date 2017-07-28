package creational.abstract_factory.app;

import creational.abstract_factory.factories.RecipeFactory;
import creational.abstract_factory.factories.implementations.AdultCuisineFactory;
import creational.abstract_factory.factories.implementations.KidCuisineFactory;
import creational.abstract_factory.products.Dessert;
import creational.abstract_factory.products.Sandwich;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Scanner;


public class Restaurant {

    public static void main(String[] args) {
        System.out.println("Who are you? (A)dult or (C)hild?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        RecipeFactory factory;
        switch (input) {
            case "A":
                factory = new AdultCuisineFactory();
                break;
            case "C":
                factory = new KidCuisineFactory();
                break;
            default:
                throw new NotImplementedException();
        }
        Sandwich sandwich = factory.createSandwich();
        Dessert dessert = factory.createDessert();
        System.out.println("Sandwich: " + sandwich.getClass().getSimpleName());
        System.out.println("Dessert: " + dessert.getClass().getSimpleName());
    }
}


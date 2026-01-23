package com.flipfit.client;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to FlipFit!");

        while (true) {
            System.out.println("Choose your role:");
            System.out.println("1. Admin");
            System.out.println("2. Gym Owner");
            System.out.println("3. Customer");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    AdminMenu adminMenu = new AdminMenu();
                    adminMenu.displayMenu();
                    break;
                case 2:
                    GymOwnerMenu gymOwnerMenu = new GymOwnerMenu();
                    gymOwnerMenu.displayMenu();
                    break;
                case 3:
                    CustomerMenu customerMenu = new CustomerMenu();
                    customerMenu.displayMenu();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

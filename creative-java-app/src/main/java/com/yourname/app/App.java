package com.ki.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("🌟 Welcome to Creative Java App! 🌟\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Show Greeting");
        System.out.println("2. Fun ASCII Art");
        System.out.println("3. Exit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nHello from Jenkins + Maven! 🚀");
                break;
            case 2:
                System.out.println("\n  *   *\n *     *\n* Hello *\n *     *\n  *   *");
                break;
            case 3:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

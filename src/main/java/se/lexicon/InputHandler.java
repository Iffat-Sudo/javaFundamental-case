package se.lexicon;

import java.util.Scanner;

public class InputHandler {
    private static Scanner input = new Scanner(System.in);

    public String getMenuChoice() {
        System.out.println("Please choose from the following options:");
        return input.nextLine();
    }
    public double getAmount() {
        while (true) {
            System.out.println("Please enter the amount to convert:");
            try {
                double amount = input.nextDouble();
                if (amount <= 0) {
                    System.out.println("Invalid amount");
                    continue;
                }
                return amount;
                catch (Exception) {
                    System.out.println("Invalid amount");

                }
        }
    }
}

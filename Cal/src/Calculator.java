package Revision.Cal.src;

import java.util.Scanner;

public class Calculator {

    public static String operator;
    public static Double entry1, entry2, $last;

    public static void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a calculation (e.g., 1 + 3 or $last + 9): ");

        try {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.exit(0); // Exit the program if the user types 'exit'
            }

            if (input.contains("$last")) {
                // Replace $last with its actual value
                input = input.replace("$last", String.valueOf($last));
            }

            String[] parts = input.split(" ");
            entry1 = Double.parseDouble(parts[0]);
            operator = parts[1];
            entry2 = Double.parseDouble(parts[2]);

            switch (operator) {
                case "+":
                    $last = entry1 + entry2;
                    System.out.println(entry1 + " + " + entry2 + " = " + $last);
                    break;
                case "-":
                    $last = entry1 - entry2;
                    System.out.println(entry1 + " - " + entry2 + " = " + $last);
                    break;
                case "*":
                    $last = entry1 * entry2;
                    System.out.println(entry1 + " * " + entry2 + " = " + $last);
                    break;
                case "/":
                    $last = entry1 / entry2;
                    System.out.println(entry1 + " / " + entry2 + " = " + $last);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid calculation.");
        }
    }
}

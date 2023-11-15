package Revision.Cal.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            cal.calculate();
            System.out.println("Last result: " + Calculator.$last);

            System.out.println("Press Enter to continue or type 'exit' to end the program:");
            String userInput = inputScanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user types 'exit'
            }
        }

        System.out.println("Program exited. Thank you!");
        inputScanner.close();
    }
}

import java.util.Scanner;

public class NumberClassifierMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char userChoice = 'Y'; // Initialize userChoice to 'Y' for the first loop

        do {
            // Step 4: Display Menu Options
            System.out.println("=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            // Step 5: Read User Choice
            int choice = input.nextInt();

            // Step 6: Switch Statement for Menu Handling
            switch (choice) {
                case 1:
                    // Step 7: Case 1: Classify Number
                    System.out.print("Enter a number to classify: ");
                    int number = input.nextInt();
                    if (number > 0) {
                        System.out.println("The number " + number + " is positive.");
                        if (number % 2 == 0) {
                            System.out.println("It is an even number.");
                        } else {
                            System.out.println("It is an odd number.");
                        }
                    } else if (number < 0) {
                        System.out.println("The number " + number + " is negative.");
                    } else {
                        System.out.println("The number " + number + " is zero.");
                    }
                    break;

                case 2:
                    // Step 8: Case 2: Multiplication Table
                    System.out.print("Enter a number to display its multiplication table: ");
                    int tableNumber = input.nextInt();
                    System.out.println("Multiplication Table for " + tableNumber + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
                    }
                    break;

                case 3:
                    // Step 9: Case 3: Exit
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    // Step 10: Default Case
                    System.out.println("Invalid option. Please choose between 1 and 3.");
            }

            // Step 11: Ask to Continue
            input.nextLine(); // Consume the leftover newline character
            System.out.print("Do you want to return to the menu? (Y/N): ");
            userChoice = input.nextLine().toUpperCase().charAt(0);

        } while (userChoice == 'Y');

        // Step 12: Close Scanner
        input.close();
    }
}
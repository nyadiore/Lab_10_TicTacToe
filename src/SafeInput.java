import java.util.Scanner;

public class SafeInput {
    public static int getRangedInt(Scanner console, String prompt, int low, int high) {
        int input = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            if (console.hasNextInt()) {
                input = console.nextInt();
                if (input >= low && input <= high) {
                    valid = true;
                } else {
                    System.out.println("Error: Input must be between " + low + " and " + high);
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a number.");
                console.next(); // Clear invalid input
            }
        }
        return input;
    }

    public static boolean getYNConfirm(Scanner console, String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = console.next();
            if (input.equalsIgnoreCase("Y")) {
                return true;
            } else if (input.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Error: Please enter Y or N.");
            }
        } while (true);
    }
}

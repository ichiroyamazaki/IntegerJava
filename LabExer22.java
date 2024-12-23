import java.util.Scanner;

public class LabExer22 {

    // Method to add 10 to the number
    public static void showNumberPlus10(int number) {
        System.out.println(number + " plus 10 is " + (number + 10) + ".");
    }

    // Method to add 100 to the number
    public static void showNumberPlus100(int number) {
        System.out.println(number + " plus 100 is " + (number + 100) + ".");
    }

    // Method to add 1000 to the number
    public static void showNumberPlus1000(int number) {
        System.out.println(number + " plus 1000 is " + (number + 1000) + ".");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Call the methods to display the results
        showNumberPlus10(number);
        showNumberPlus100(number);
        showNumberPlus1000(number);

        input.close(); // Close the scanner
    }
}

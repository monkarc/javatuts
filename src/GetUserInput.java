import java.util.Scanner;

public class GetUserInput {
    public static void main(String[] args) {

        //Create scanner object
        Scanner input = new Scanner(System.in);

        // Output the prompt
        System.out.println("Enter an integer: ");

        // Wait for the user to enter a line of text.
        int value = input.nextInt();

        // Tell them what they entered
        System.out.println("You entered: " + value);
    }
}

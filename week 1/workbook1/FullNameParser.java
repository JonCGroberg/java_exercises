
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name(first last OR first middle last: ");

        String[] userInput = scanner.nextLine().trim().split(" ");
        String first, middle, last;

        if (userInput.length == 3) {
            first = userInput[0];
            middle = userInput[1];
            last = userInput[2];
            System.out.printf("First name: %s\nMiddle name: %s\nLast name: %s", first
                    , middle, last);
        } else if (userInput.length == 2) {
            first = userInput[0];
            last = userInput[1];
            System.out.printf("First name: %s\nLast name: %s", first
                    , last);
        } else {
            System.out.println("Make sure you follow this format: first last OR first middle last");
        }
    }
}


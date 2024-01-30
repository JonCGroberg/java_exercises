import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = userInput.nextInt();
        userInput.nextLine();

        System.out.print("Enter the second number: ");
        int second = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Possible Calculations: \n\t(A)dd \n\t(S)ubtract \n\t(M)ultiply \n\t(D)ivide");
        System.out.print("Please select an option: ");
        String option = userInput.next().toUpperCase();

        double result = 0;
        String operation = "";

        switch (option) {
            case "A":
                result = first + second;
                operation = "+";
                break;
            case "S":
                result = first - second;
                operation = "-";
                break;
            case "M":
                result = first * second;
                operation = "*";
                break;
            case "D":
                result = (double) first / second;
                operation = "/";
                break;
        }
        System.out.printf("%d %s %d = %f%n", first, operation, second, result);
    }
}
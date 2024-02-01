import com.pluralsight.CellPhone;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        String serialNum, model, carrier, phoneNum, owner;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        serialNum = scanner.nextLine();
        System.out.print("What is the model? ");
        model = scanner.nextLine();
        System.out.print("Who is the carrier? ");
        carrier = scanner.nextLine();
        System.out.print("What is the phone number? ");
        phoneNum = scanner.nextLine();
        System.out.print("Who is the owner? ");
        owner = scanner.nextLine();

        CellPhone cellPhone1 = new CellPhone(serialNum, model, carrier, phoneNum, owner);
        System.out.println(cellPhone1);
    }
}

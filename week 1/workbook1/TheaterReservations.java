import java.util.Date;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        String[] names;
        String first,last;
        Date date;
        int numTickets;
        Scanner userinput = new Scanner(System.in);

        System.out.print("Please enter your first and last name: ");
        names = userinput.nextLine().split(" ");
        first = names[0];
        last = names[1];

        System.out.print("What date will you be coming (MM/DD/YYYY): ");
        date = new Date(userinput.next());

        System.out.print("How many tickets would you like? ");
        numTickets = userinput.nextInt();

        System.out.printf("%d tickets reserved for %tD under %s, %s",numTickets,date,first,last);
    }
}
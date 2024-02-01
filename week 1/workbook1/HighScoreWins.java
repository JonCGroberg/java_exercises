import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        String team1, team2, score1, score2, winner;

        System.out.print("Please enter a game score: ");

        Scanner scanner = new Scanner(System.in);
        String[] userInput = scanner.nextLine().split("[:|]");

        team1 = userInput[0];
        team2 = userInput[1];
        score1 = userInput[2];
        score2 = userInput[3];

        if (Integer.parseInt(score1) > Integer.parseInt(score2)) {
            winner = team1;
        } else {
            winner = team2;
        }

        System.out.print("Winner: " + winner);
    }
}

package com.pluralsight.games;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CardGame {
    private ArrayList<Hand> players = new ArrayList<>();
    private Deck deck = new Deck();

    public void start() {
        // start by asking the user for the amount of players and add them to the list
        createPlayersIO();

        //Shuffle the deck
        System.out.println("\nShuffling...");
        deck.shuffle();


        // loop and deal the cards
        System.out.println("Dealing cards...\n");
        for (Hand hand : players) {
            hand.deal(deck.deal());
            hand.deal(deck.deal());
        }

        // loop and determine who won
        System.out.println("----- The Winner is! ----");
        int highestScore = 0;
        Hand highestHand = null;
        for (Hand hand : players) {
            int handValue = hand.getValue();
            if (highestScore < handValue && handValue <= 21) {
                highestHand = hand;
                highestScore = handValue;
            }
        }

        // display the winner
        highestHand.showHand();
        System.out.println("Winner:\t\t\t" + highestHand.getPlayerName());
        System.out.println("Winning hand:\t" + highestHand);
        System.out.println("Winning score:\t" + highestHand.getValue());
    }


    public void createPlayersIO() {
        Scanner scanner = new Scanner(System.in);
        int numPlayers;

        System.out.print("How many players are playing today? ");
        numPlayers = scanner.nextInt();
        scanner.nextLine();

        if (numPlayers <1) createPlayersIO();


        for (int i = 0; i < numPlayers; i++) {
            String playerName;
            Hand newPlayerHand;

            System.out.printf("Enter player %d's name: ", i + 1);

            playerName = scanner.nextLine().trim();
            playerName = playerName.substring(0,1).toUpperCase() + playerName.substring(1);
            newPlayerHand = new Hand(playerName);
            players.add(newPlayerHand);
        }

    }
}

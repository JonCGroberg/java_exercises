package com.pluralsight.games;

import java.util.ArrayList;
import java.util.Date;

public class CardGame {
    private ArrayList<Hand> players = new ArrayList<>();
    private Deck deck = new Deck();

    public void start() {
        // start by adding a few players
        players.add(new Hand("Daisy"));
        players.add(new Hand("Tee"));
        players.add(new Hand("Gabe"));

        // loop and deal the cards

        deck.shuffle();
        for (Hand hand : players) {
            hand.deal(deck.deal());
            hand.deal(deck.deal());
        }

        // loop and determine who won

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
        assert highestHand != null;
        highestHand.showHand();
        System.out.println("Winner: " + highestHand.getPlayerName());
        System.out.println("With a hand of: " + highestHand);
        System.out.println("With a score of: " + highestHand.getValue());
    }
}

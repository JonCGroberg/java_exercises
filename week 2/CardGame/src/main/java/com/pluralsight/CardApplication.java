package com.pluralsight;

import com.pluralsight.games.CardGame;

import java.util.Objects;
import java.util.Scanner;

public class CardApplication
{
    public static void main(String[] args)
    {
        gameLogic();
    }

    public static void gameLogic(){
        Scanner scanner = new Scanner(System.in);
        CardGame game = new CardGame();
        game.start();

        System.out.print("\nPlay again? (y/n) ");
        if(Objects.equals(scanner.nextLine(), "y")) gameLogic();
        else System.out.println("Thanks for playing! ");
    }
}

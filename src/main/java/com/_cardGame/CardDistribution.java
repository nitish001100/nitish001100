package com._cardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static com._cardGame.Constants.*;

public class CardDistribution {

    static int numOfPlayersPlaying = 0;

    public List<List<String>> cardDistribution() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many players want to play?");

        numOfPlayersPlaying = Integer.valueOf(scanner.nextLine());

        totalCardsInDeckRem = totalCardsInDeck - (totalCardsInDeck % numOfPlayersPlaying);

        System.out.println("Distributing card among players..");

        List<String> cardList = cardsDistributeBetweenPlayers();

        int min = 0, max = 0;

        int cardPerPlayer = totalCardsInDeckRem / numOfPlayersPlaying;

        List<List<String>> cardsHoldByPlayer = new ArrayList<>();

        for (int i = 0; i < numOfPlayersPlaying; i++) {

            List<String> cardsHoldByPerPlayer = new ArrayList<>(cardPerPlayer);

            for (int j = 0; j < cardPerPlayer; j++) {
                max = cardList.size() - 1;
                int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                cardsHoldByPerPlayer.add(cardList.get(randomNum));
                cardList.remove(randomNum);
            }

            cardsHoldByPlayer.add(cardsHoldByPerPlayer);

        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Exception occurring while distributing cards.");
        }
        System.out.println(totalCardsInDeckRem + " cards distributed among " + numOfPlayersPlaying + " players.");

        return cardsHoldByPlayer;
    }

    public List<String> cardsDistributeBetweenPlayers() {
        List<String> cardsList = new ArrayList<>();
        cardsList.add(heart_2);
        cardsList.add(heart_3);
        cardsList.add(heart_4);
        cardsList.add(heart_5);
        cardsList.add(heart_6);
        cardsList.add(heart_7);
        cardsList.add(heart_8);
        cardsList.add(heart_9);
        cardsList.add(heart_10);
        cardsList.add(heart_11);
        cardsList.add(heart_12);
        cardsList.add(heart_13);
        cardsList.add(heart_14);

        cardsList.add(diamond_2);
        cardsList.add(diamond_3);
        cardsList.add(diamond_4);
        cardsList.add(diamond_5);
        cardsList.add(diamond_6);
        cardsList.add(diamond_7);
        cardsList.add(diamond_8);
        cardsList.add(diamond_9);
        cardsList.add(diamond_10);
        cardsList.add(diamond_11);
        cardsList.add(diamond_12);
        cardsList.add(diamond_13);
        cardsList.add(diamond_14);

        cardsList.add(spade_2);
        cardsList.add(spade_3);
        cardsList.add(spade_4);
        cardsList.add(spade_5);
        cardsList.add(spade_6);
        cardsList.add(spade_7);
        cardsList.add(spade_8);
        cardsList.add(spade_9);
        cardsList.add(spade_10);
        cardsList.add(spade_11);
        cardsList.add(spade_12);
        cardsList.add(spade_13);
        cardsList.add(spade_14);

        cardsList.add(club_2);
        cardsList.add(club_3);
        cardsList.add(club_4);
        cardsList.add(club_5);
        cardsList.add(club_6);
        cardsList.add(club_7);
        cardsList.add(club_8);
        cardsList.add(club_9);
        cardsList.add(club_10);
        cardsList.add(club_11);
        cardsList.add(club_12);
        cardsList.add(club_13);
        cardsList.add(club_14);

        return cardsList;
    }
}
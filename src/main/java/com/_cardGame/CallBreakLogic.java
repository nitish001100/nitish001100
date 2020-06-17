package com._cardGame;

import java.util.*;

import static com._cardGame.Constants.totalCardsInDeckRem;

class Player implements Runnable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void run() {

    }
}

public class CallBreakLogic {

    static Map<Integer, Integer> winnerMap = new HashMap<>();

    static List<List<String>> cardsHoldByPlayersP = null;

    void intelligenceCode(List<List<String>> cardsHoldByPlayers, String trump) {

        cardsHoldByPlayersP = cardsHoldByPlayers;
        int numOfPlayersPlaying = 4; //CardDistribution.numOfPlayersPlaying;
        int cardPerPlayer = 0;
        Thread[] threads = new Thread[numOfPlayersPlaying];

        cardPerPlayer = totalCardsInDeckRem / numOfPlayersPlaying;

        for (int i = 0; i < numOfPlayersPlaying; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Player Name - ");
            String playerName = scanner.nextLine();

            Player player = new Player();
            player.setName(playerName);
            Thread thread = new Thread(player);
            thread.setName(player.getName());
            threads[i] = thread;
        }

        letsPlay(threads, cardPerPlayer, trump);

    }

    static String maxCardAtTable = null;
    static int maxCardOfWhichPlayer = 0;


    private static void letsPlay(Thread[] threads, int cardPerPlayer, String trump) {

        for (int rounds = 0; rounds < cardPerPlayer; rounds++) {
            List<String> table = new ArrayList<>();

            System.out.println("******************************************************************************************************************");
            System.out.println("Round " + rounds + " starts.");
            for (int player = 0; player < threads.length; player++) {
                throwCard(player, table, trump);
            }

            System.out.println("Cards at table are - ");
            table.stream().forEach(card -> System.out.print(card + " "));

            System.out.println("\nMax card at table is " + maxCardAtTable + " thrown by player " + maxCardOfWhichPlayer + " who win this round.");

            if (winnerMap.containsKey((Integer) maxCardOfWhichPlayer)) {
                int value = winnerMap.get(maxCardOfWhichPlayer);
                winnerMap.put(maxCardOfWhichPlayer, value + 1);
            } else if (!winnerMap.containsKey((Integer) maxCardOfWhichPlayer)) {
                winnerMap.put(maxCardOfWhichPlayer, 1);
            }

            System.out.println("Round " + rounds + " finished.");
            System.out.println("******************************************************************************************************************\n");
        }


        System.out.println("Computing the Results .. .. .. .. .. .. ..");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int maxKey = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;

        Set<Map.Entry<Integer, Integer>> var = winnerMap.entrySet();

        Iterator<Map.Entry<Integer, Integer>> itr = var.iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> value = itr.next();
            if (value.getValue() > maxValue) {
                maxKey = value.getKey();
                maxValue = value.getValue();
            }
        }

        System.out.println("Player " + maxKey + " won the match and scored " + maxValue);

    }


    private static void throwCard(int player, List<String> table, String trump) {

        if (table.size() == 0) {

            List<String> cardsHoldByFirstPlayer = cardsHoldByPlayersP.get(player);
            System.out.println("Player " + player + " cards are listed below - ");
            cardsHoldByFirstPlayer.stream().forEach(card -> System.out.print(card + " "));
            int min = 0, max = cardsHoldByFirstPlayer.size() - 1;
            int random_int = (int) (Math.random() * (max - min + 1) + min);
            String card = cardsHoldByFirstPlayer.get(random_int);
            cardsHoldByFirstPlayer.remove(random_int);
            cardsHoldByPlayersP.remove(player);
            cardsHoldByPlayersP.add(player, cardsHoldByFirstPlayer);
            maxCardAtTable = card;
            maxCardOfWhichPlayer = player;
            table.add(maxCardAtTable);

        } else if (table.size() != 0) {
            String currentCardWhichIsMax = "NA";

            String smallestCard = null;
            int smallestCardOfSameType = Integer.MAX_VALUE;
            int smallestCardIndex = 0;


            List<String> cardsHoldByCurrentPlayer = cardsHoldByPlayersP.get(player);

            System.out.println("Player " + player + " cards are listed below - ");
            cardsHoldByCurrentPlayer.stream().forEach(card -> System.out.print(card + " "));

            for (int i = 0; i < cardsHoldByCurrentPlayer.size(); i++) {
                List<String> maxCardAtTableCardDetails = cardParser(maxCardAtTable);
                List<String> currentCardParsedDetails = cardParser(cardsHoldByCurrentPlayer.get(i));

                if (((String) (maxCardAtTableCardDetails.get(0))).equals((String) currentCardParsedDetails.get(0))) {

                    if ((Integer.valueOf(maxCardAtTableCardDetails.get(1))) < (Integer.valueOf(currentCardParsedDetails.get(1)))) {
                        maxCardAtTableCardDetails.remove(1);
                        maxCardAtTableCardDetails.add(1, currentCardParsedDetails.get(1));
                        maxCardOfWhichPlayer = player;
                        maxCardAtTable = cardsHoldByCurrentPlayer.get(i);
                        currentCardWhichIsMax = maxCardAtTable;
                    }

                    if ((Integer.valueOf(currentCardParsedDetails.get(1))) < smallestCardOfSameType) {
                        smallestCard = cardsHoldByCurrentPlayer.get(i);
                        smallestCardOfSameType = Integer.valueOf(currentCardParsedDetails.get(1));
                        smallestCardIndex = i;
                    }

                }
            }

            if (currentCardWhichIsMax.equals("NA")) {
                System.out.println("Player " + player + " don't have such card, which is max with " + maxCardAtTable + " this card. So adding smallest card of same type " + smallestCard);

                String minTrumpCard = null;
                int min = Integer.MAX_VALUE;
                int minTrumpCardIndex = 0;

                if (smallestCard == null) {
                    for (int i = 0; i < cardsHoldByCurrentPlayer.size(); i++) {
                        String card = cardsHoldByCurrentPlayer.get(i);
                        List<String> cardDetails = cardParser(card);

                        if (cardDetails.get(0).equals(((String) trump))) {
                            if (min > Integer.valueOf(cardDetails.get(1))) {
                                min = Integer.valueOf(cardDetails.get(1));
                                minTrumpCard = card;
                                minTrumpCardIndex = i;
                            }
                        }
                    }
                    table.add(minTrumpCard);
                } else {
                    table.add(smallestCard);
                }
            } else {
                table.add(maxCardAtTable);
            }
        }
    }


    private static List<String> cardParser(String card) {
        String[] strArr = card.split("_");
        List<String> cardParsedDetails = new ArrayList<>();
        cardParsedDetails.add(strArr[0]);
        cardParsedDetails.add(strArr[1]);
        return cardParsedDetails;
    }
}

class CardDetails {
    private String cardType;
    private Integer whichCard;


    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Integer getWhichCard() {
        return whichCard;
    }

    public void setWhichCard(Integer whichCard) {
        this.whichCard = whichCard;
    }

    @Override
    public String toString() {
        return "CardDetails{" +
                "cardType='" + cardType + '\'' +
                ", whichCard='" + whichCard + '\'' +
                '}';
    }
}
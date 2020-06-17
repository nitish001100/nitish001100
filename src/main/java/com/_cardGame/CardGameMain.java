package com._cardGame;

import java.util.List;

public class CardGameMain {
    public static void main(String[] args) {
        System.out.println("Let's play Call Break.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver();
    }

    private static void driver() {
        CardDistribution cardDistribution = new CardDistribution();
        List<List<String>> cardsHoldByPlayers =  cardDistribution.cardDistribution();


        for (int i = 0; i < cardsHoldByPlayers.size(); i++) {
            List<String> playerCard = cardsHoldByPlayers.get(i);
            for (int j = 0; j < playerCard.size(); j++) {
                System.out.print(playerCard.get(j)+" ");
            }
            System.out.println();
        }

        System.out.println("What is the trump?............ Let's allow the, machine decide.");
        GenerateTrump generateTrump = new GenerateTrump();
        String trump = generateTrump.genTrump();
        System.out.println("Guys \"" + trump + "\" is the trump.");


        CallBreakLogic callBreak_logic = new CallBreakLogic();
        callBreak_logic.intelligenceCode(cardsHoldByPlayers, trump);
    }
}

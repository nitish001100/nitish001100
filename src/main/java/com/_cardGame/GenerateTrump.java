package com._cardGame;

public class GenerateTrump {

    static private String heart = "heart";
    static private String diamond = "diamond";
    static private String spade = "spade";
    static private String club = "club";
    static private String error = "UnIdentified card object found.";
    static private int min = 0, max = 3, numType = 4;

    public String genTrump() {

        Object[] cardsType = new Object[numType];

        CardsType cards_type_heart = new CardsType();
        CardsType.Heart heartObj = cards_type_heart.new Heart();
        heartObj.setHeart(heart);
        cardsType[0] = heartObj;


        CardsType cards_type_diamond = new CardsType();
        CardsType.Diamond diamondObj = cards_type_diamond.new Diamond();
        diamondObj.setDiamond(diamond);
        cardsType[1] = diamondObj;


        CardsType cards_type_spade = new CardsType();
        CardsType.Spade spadeObj = cards_type_spade.new Spade();
        spadeObj.setSpade(spade);
        cardsType[2] = spadeObj;

        CardsType cards_type_club = new CardsType();
        CardsType.Club clubObj = cards_type_club.new Club();
        clubObj.setClub(club);
        cardsType[3] = clubObj;


        int genRandomTrump = (int) (Math.random() * (max - min + 1) + min);
        Object trumpObj = cardsType[genRandomTrump];

        if (trumpObj instanceof CardsType.Heart)
            return heart;

        if (trumpObj instanceof CardsType.Diamond)
            return diamond;

        if (trumpObj instanceof CardsType.Spade)
            return spade;

        if (trumpObj instanceof CardsType.Club)
            return club;

        return error;
    }
}

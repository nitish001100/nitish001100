package com._cardGame;


class CardsType {
    class Heart {
        private String heart;

        public String getHeart() {
            return heart;
        }

        public void setHeart(String heart) {
            this.heart = heart;
        }

        @Override
        public String toString() {
            return "Heart{" +
                    "heart='" + heart + '\'' +
                    '}';
        }
    }

    class Spade {
        private String spade;

        public String getSpade() {
            return spade;
        }

        public void setSpade(String spade) {
            this.spade = spade;
        }

        @Override
        public String toString() {
            return "Spade{" +
                    "spade='" + spade + '\'' +
                    '}';
        }
    }

    class Diamond {
        private String diamond;

        public String getDiamond() {
            return diamond;
        }

        public void setDiamond(String diamond) {
            this.diamond = diamond;
        }

        @Override
        public String toString() {
            return "Diamond{" +
                    "diamond='" + diamond + '\'' +
                    '}';
        }
    }

    class Club {

        private String club;

        public String getClub() {
            return club;
        }

        public void setClub(String club) {
            this.club = club;
        }

        @Override
        public String toString() {
            return "Club{" +
                    "club='" + club + '\'' +
                    '}';
        }
    }
}
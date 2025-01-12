package org.yahtzee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class YahtzeeTest {

    @Test
    void scoreOfFours(){
        Yahtzee yahtzee = new Yahtzee();
        int[] diceValues = {1, 1, 2, 4, 4};

        yahtzee.addToCategorie(yahtzee.FOURS, diceValues);

        Assertions.assertEquals(8, yahtzee.getScore());
    }

    @Test
    void scoreOfPairs(){
        Yahtzee yahtzee = new Yahtzee();
        int[] diceValues = {3, 3, 3, 4, 4};

        yahtzee.addToCategorie(yahtzee.PAIRS, diceValues);

        Assertions.assertEquals(8, yahtzee.getScore());
    }

    @Test
    void scoreTwoPairs(){
        Yahtzee yahtzee = new Yahtzee();
        int[] diceValues = {1, 1, 2, 3, 3};

        yahtzee.addToCategorie(yahtzee.TWO_PAIRS, diceValues);

        Assertions.assertEquals(8, yahtzee.getScore());
    }

    @Test
    void scoreThreeOfKind(){
        Yahtzee yahtzee = new Yahtzee();
        int[] diceValues = {3, 3, 3, 4, 5};

        yahtzee.addToCategorie(yahtzee.THREE_OF_KIND, diceValues);

        Assertions.assertEquals(9, yahtzee.getScore());
    }
}
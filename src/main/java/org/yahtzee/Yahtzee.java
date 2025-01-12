package org.yahtzee;

import java.util.HashMap;
import java.util.Map;

public class Yahtzee {

    public static final String TWO_PAIRS = "TWO_PAIRS" ;
    public static final String THREE_OF_KIND = "THREE_OF_KIND";
    public static final String FOURS = "FOURS";
    public static final String PAIRS = "PAIRS";
    Map<String, int[]> valuesByCategory= new HashMap<>();


    void addToCategorie(String categorie, int[] diceValues){
        valuesByCategory.put(categorie, diceValues);
    }

    int getScore(){
        int score = 0;

        score += sumFours(valuesByCategory.get(FOURS));
        score += sumPairs(valuesByCategory.get(PAIRS));
        score += sumPairs(valuesByCategory.get(TWO_PAIRS));
        score += sumThreeOfKind(valuesByCategory.get(THREE_OF_KIND));

        return score;
    }

    private int sumThreeOfKind(int[] values) {
        if(values == null){
            return 0;
        }

        int sum = 0;

        int pairs[] = new int[6];
        for(int i = 0; i < values.length; i++){
            pairs[values[i] - 1]++;
        }

        for(int i = 0; i < pairs.length; i++){
            if(pairs[i] == 3){
                sum += (i+1)*3;
            }
        }

        return sum;
    }


    int sumPairs(int[] values) {
        if(values == null){
            return 0;
        }

        int sum = 0;

        int pairs[] = new int[6];
        for(int i = 0; i < values.length; i++){
            pairs[values[i] - 1]++;
        }

        for(int i = 0; i < pairs.length; i++){
            if(pairs[i] == 2){
                sum += (i+1)*2;
            }
        }

        return sum;
    }

    int sumFours(int[] values){
        if(values == null){
            return 0;
        }

        int sum = 0;

        for(int value : values){
            if(value == 4) {
                sum += 4;
            }
        }

        return sum;
    }
}

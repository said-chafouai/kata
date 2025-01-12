package org.palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {
    public boolean isPalindrome(String phrase) {

//        phrase = phrase.toLowerCase();
//        phrase = cleanPhrase(phrase);

        if(phrase.isEmpty()){
            return false;
        }

        phrase = phrase.replaceAll("[^A-Za-z0-9]", "").toLowerCase();



        for(int i = 0; i < phrase.length() / 2; i++){
            if( phrase.charAt(i) != phrase.charAt(phrase.length() - 1 - i)){
                return false;
            }
        }

        return true;
    }

    private String cleanPhrase(String phrase){
        List<Character> specialCharacters = Arrays.asList(',', ' ', ';');
        String cleanedSentence = "";

        for(int i = 0; i < phrase.length(); i++){
            if(!specialCharacters.contains(phrase.charAt(i))){
                cleanedSentence += phrase.charAt(i);
            }
        }

        return cleanedSentence;
    }
}

package org.palindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome palindrome;

    @BeforeEach
    void init(){
        palindrome = new Palindrome();
    }

    @Test
    void theEvenStringIsPalindrome(){
        boolean isPalindrome = palindrome.isPalindrome("abccba");

        assertEquals(true, isPalindrome);
    }

    @Test
    void theEvenStringIsNotPalindrome(){
        boolean isPalindrome = palindrome.isPalindrome("abccbae");

        assertEquals(false, isPalindrome);
    }

    @Test
    void theOddStringIsPalindrome(){
        boolean isPalindrome = palindrome.isPalindrome("abcba");

        assertEquals(true, isPalindrome);
    }

    @Test
    void theOddStringIsNotPalindrome(){
        boolean isPalindrome = palindrome.isPalindrome("abcbb");

        assertEquals(false, isPalindrome);
    }

    @Test
    void theStringWithOneCaracterIsPalindrome(){
        boolean isPalindrome = palindrome.isPalindrome("a");

        assertEquals(true, isPalindrome);
    }

    @Test
    void theEvenStringIsPalindromeCaseSensitive(){
        boolean isPalindrome = palindrome.isPalindrome("Hello OLLEH");

        assertEquals(true, isPalindrome);
    }

    @Test
    void theStringIsPalindromeWithSpecialCaracters(){
        boolean isPalindrome = palindrome.isPalindrome("A man, a plan, a canal, Panama");

        assertEquals(true, isPalindrome);
    }



}
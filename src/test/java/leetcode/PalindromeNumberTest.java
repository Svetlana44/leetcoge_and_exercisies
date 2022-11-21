package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeNumberTest {

    PalindromeNumber p = new PalindromeNumber();

    @Test
    void isPalindrome() {
        assertThat(p.isPalindrome(12321)).isTrue();
    }

    @Test
    void notPalindrome() {
        assertThat(p.isPalindrome(123)).isFalse();
    }
}
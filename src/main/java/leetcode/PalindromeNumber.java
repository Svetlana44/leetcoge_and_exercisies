package leetcode;

import java.util.StringJoiner;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        StringJoiner strJoiner = new StringJoiner(" ");
        int remainderOfDivision = x % 10;
        strJoiner.add(String.valueOf(remainderOfDivision));
        while (x > 10) {
            x = x / 10;
            remainderOfDivision = x % 10;
            strJoiner.add(String.valueOf(remainderOfDivision));
        }
        String charSecquence = strJoiner.toString();
        for (int i = 0; i < charSecquence.length() / 2; i++) {
            if (charSecquence.charAt(i) != charSecquence.charAt(charSecquence.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] str) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(121));
    }
}

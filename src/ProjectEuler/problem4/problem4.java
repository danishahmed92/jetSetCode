package ProjectEuler.problem4;

/**
 * @author Danish Ahmed on 3/6/2018
 *
 * Largest palindrome product
 *
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class problem4 {
    private static final int max3Digit = 999;
    private static final int min3Digit = 100;

    public static void main(String[] args) {
        System.out.println(largestPalindromeProduct(max3Digit*max3Digit, min3Digit*min3Digit));
    }

    private static Boolean isPalindrome(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }

    private static int largestPalindromeProduct(int maxNum, int minNum) {
        int palindrome = 0;
        for (int i = maxNum; i >= minNum; i--) {
            if (isPalindrome(String.valueOf(i))) {
                palindrome = i;
                int sqrt = (int) Math.sqrt(i);
                if (is3DigitProduct(sqrt, i))
                    break;
            }
        }
        return palindrome;
    }

    private static Boolean is3DigitProduct(int sqrt, int palindrome) {
        for (int i = max3Digit; i >= min3Digit; i--) {
            for (int j = sqrt; j >= min3Digit; j--) {
                if (i * j < palindrome)
                    break;
                if (i * j == palindrome) {
                    System.out.print(i + "*" + j + " = ");
                    return true;
                }
            }
        }
        return false;
    }
}

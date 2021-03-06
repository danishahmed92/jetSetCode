package ProjectEuler.problem2;

/**
 * @author Danish Ahmed on 27/02/2018
 *
 * Even Fibonacci numbers
 *
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */
public class problem2 {
    private static final int limit = 4000000;

    public static void main(String[] args) {
        System.out.println(evenFibonacciSum(1, 2, 0));
    }

    private static int evenFibonacciSum(int prev2, int prev1, int sum) {
        if (prev1 > limit)
            return sum;
        if (prev1 % 2 == 0)
            sum = sum + prev1;
        return evenFibonacciSum(prev1, prev2 + prev1, sum);
    }
}

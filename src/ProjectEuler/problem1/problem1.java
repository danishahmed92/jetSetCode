package ProjectEuler.problem1;

/**
 * @author Danish Ahmed on 26/02/2018
 *
 * Multiples of 3 and 5
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class problem1 {
    private static final int num1 = 3;
    private static final int num2 = 5;
    private static final int limit = 1000;

    public static void main(String[] args) {
        System.out.println(sumOfMultiplesUnderN());
    }

    private static int sumOfMultiplesUnderN() {
        int sum = 0;
        int multiplierNum1 = 0;
        int multiplierNum2 = 0;

        for (int i = 0; i < limit; i++) {
            multiplierNum1 = multiplierNum1 + num1;
            multiplierNum2 = multiplierNum2 + num2;

            if (multiplierNum1 < limit && multiplierNum1 % num2 != 0)
                sum = sum + multiplierNum1;
            if (multiplierNum2 < limit)
                sum = sum + multiplierNum2;

            i = multiplierNum1;
        }
        return sum;
    }

    public static int sumOfMultiplesUnderNNaive() {
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            if (i % num1 == 0 || i % num2 == 0)
                sum = sum + i;
        }
        return sum;
    }
}

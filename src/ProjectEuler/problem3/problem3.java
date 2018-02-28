package ProjectEuler.problem3;

/**
 * @author Danish Ahmed on 27/02/2018
 *
 * Largest prime factor
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class problem3 {
    private static final long num = 600851475143L;

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor());
    }

    private static long largestPrimeFactor() {
        long primeFactor = 0;
        long sqrt = (long) Math.sqrt(num);
        for (long i = 2; i <= sqrt; i++) {
            if (isPrime(i)) {
                if (num % i == 0) {
                    primeFactor = i;
                }
            }
        }
        if (primeFactor == 0)
            return num;
        return primeFactor;
    }

    private static Boolean isPrime(long n) {
        long sqrt = (long) Math.sqrt(n);
        for (long i = 2; i <= sqrt; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

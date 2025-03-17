public class isPrime {
    public static void main(String[] args) {
        isPrimeInRange(5);
    }

    public static void isPrimeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; // Numbers less than 2 are not prime
        }
        if (n == 2) {
            return true; // 2 is a prime number
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Divisible by another number, not prime
            }
        }
        return true; // Prime number
    }
}

public class Utils
{
     // Method to check if a number is prime
    public  boolean isPrime(int number) {
        if (number <= 1) {
            return false;  // 0 and 1 are not prime numbers
        }

        // Check for factors from 2 to the square root of the number
        // ? i*i<=number can also be used
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // Not a prime number
            }
        }

        return true;  // It is a prime number
    }

    public boolean isEven(int n) {
        if(n%2 == 0) {
            return true; //even number
        }
        return false; //odd number
    }
}
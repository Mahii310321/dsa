
public class Divisors 
{

     // Method to check if a number is prime
    public  boolean isPrime(int number) {
        if (number <= 1) {
            return false;  // 0 and 1 are not prime numbers
        }

        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // Not a prime number
            }
        }

        return true;  // It is a prime number
    }

    public boolean exactThreeDivisors(int num)
    {
        /* 
        * num will have atleast 2 divisors for sure (1, num itself) unless the num is any of 1,2,3
        * one of the other divisor is sqrt of num (SQRT of num)
        * if the perfect square from the above line is not a  prime number it will have multiple divisors
        * otherwise then the num has only 3 divisors - (1, perfect square,  num itself)
         */

        int sqrt = (int) Math.sqrt(num);

        // ? check for perfect square or not 
        if(sqrt*sqrt==num)
        {
            // ? check for prime number
            if(isPrime(sqrt))
                return true; // prime
            else
                return false; 
        }
        else
            return false; 

    }
}
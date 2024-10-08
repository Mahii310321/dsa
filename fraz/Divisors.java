
public class Divisors 
{

    

    public boolean exactThreeDivisors(int num)
    {
        /* 
        * num will have atleast 2 divisors for sure (1, num itself) unless the num is any of 1,2,3
        * one of the other divisor is sqrt of num (SQRT of num)
        * if the perfect square from the above line is not a  prime number it will have multiple divisors
        * otherwise then the num has only 3 divisors - (1, perfect square,  num itself)
         */

        Utils util = new Utils();

        int sqrt = (int) Math.sqrt(num);

        // ? check for perfect square or not 
        if(sqrt*sqrt==num)
        {
            // ? check for prime number
            if(util.isPrime(sqrt))
                return true; // prime
            else
                return false; 
        }
        else
            return false; 

    }
}
public class Questions
{
    // ? number of matches
    public int numberOfMatches(int n)
    {
        int totalMatches = 0;
        Utils util = new Utils();
        // time complexity= O(log(n))
        // space complexity= O(1)
        while (n>1)
        {
            if(util.isEven(n))
            {
                totalMatches+=n/2;
                n=n/2;
            }
            else
            {
                totalMatches+=(n-1)/2;
                n=((n-1)/2)+1;
            }
        }
        return totalMatches;
    }

    // ? gcd 
    public int gcd(int a , int b)
    {
        // * 1 is gcd of any number
        int result=1;
        for (int i=1; i<Math.min(a,b); i++)
        {
            if(a%i==0 && b%i==0)
            {
                result=i;
            }
        }
        return result;
    }



    

}
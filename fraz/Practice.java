




public class Practice
{
    public static void main (String[] args)
    {
        // ?first one
        MinimumSum obj = new MinimumSum();
        int sum =obj.fourDigitsSolution(1005);
        if(sum!=-1)
            System.out.println("minimum sum"+" "+ sum);

        // ? pivot integer
        PivotInteger obj2=new PivotInteger();
        int pivot = obj2.solution(8);
        if(pivot!=-1)
            System.out.println("Pivot int is "+pivot);

        //  ? divisors
        Divisors obj3=new Divisors();
        int x = 32;
        boolean check=obj3.exactThreeDivisors(x);
        if(check)
            System.out.println(check + " : "+x +" has three divisors");
        else 
            System.out.println(check +" : "+x +" doesn't have  three divisors");
        
        // ? number of matches
        Questions obj4=new Questions();
        int numMatches=obj4.numberOfMatches(6);
        System.out.println("number of matches : "+numMatches);

        // ? gcd
        int gcd=obj4.gcd(8,12);
        System.out.println("gcd : "+gcd);
    }
}
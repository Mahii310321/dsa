

public class PivotInteger 
{
    // ? find pivot int where sum of lhs = sum of rhs
    public int solution(int num)
    {
        //* x=sqrt(num*(num+1))/2;
        int pivot= (num*num+num)/2;

        // * type casting
        int x = (int) Math.sqrt(pivot);

        if(x*x==pivot)
            // perfect square
            return x;
        else 
            return -1;
        
    }
}
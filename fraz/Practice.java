import java.util.Arrays;


class MinimumSum
{
    //? minimum sum of a four digit number after dividing it into two parts
    public static int fourDigitsSolution(int num)
    {
        // * store all the digits in the num in an array
        int digits[]= new int[4];
        int index=0;
        while(num>0)
        {
            int currentLastDigit=num%10;

            digits[index] = currentLastDigit;
            index++;

            num=num/10;
        }

        Arrays.sort(digits);
        if(digits.length !=4) return -1;

        //* after sorting take the smallest number in the tens place 
        int firstNumber=digits[0]*10+digits[2];
        int secondNumber=digits[1]*10+digits[3];

        return firstNumber+secondNumber;
    }
}



public class Practice
{
    public static void main (String[] args)
    {
        MinimumSum obj = new MinimumSum();
        int sum =obj.fourDigitsSolution(1005);
        if(sum!=-1)
            System.out.println("minimum sum"+" "+ sum);
    }
}
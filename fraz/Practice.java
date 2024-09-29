




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


    }
}
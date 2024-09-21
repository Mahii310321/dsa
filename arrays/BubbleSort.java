public class BubbleSort
{
    public static void main(String[]args)
    {
        int nums[]={8,6,3,2,5,9,1};
        int len=nums.length;
        int temp=0;

        System.out.println("before sort");
        for(int num :nums){
            System.out.print(num+"  ");
        }

        for(int i=0; i<len; i++)
        {
            for(int j=0; j<len-i-1; j++)
            {
                if(nums[j]>nums[j+1])
                {
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }
            }
        System.out.println();
        System.out.println("while sorting");
        for(int num :nums){
            System.out.print(num+"  ");
        }
        }

        System.out.println();
        System.out.println("after sort");
        for(int num :nums){
            System.out.print(num+"  ");
        }
    }
}
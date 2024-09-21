public class SelectionSort 
{
    public static void main(String[] args)
    {
        int nums[]={8,6,3,2,5,9,1};
        int len=nums.length;
        int temp=0;
        int minIndex=-1;
        System.out.println("befor sort: ");
        for(int num: nums)
        {
            System.out.print(num + " ");
        }

        for(int i=0; i<len-1; i++)
        {
            minIndex = i;
            for(int j=i+1; j<len; j++)
            {
                if(nums[minIndex]>nums[j])
                    minIndex = j;
            }
            temp=nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println("------");
            for(int num: nums)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }


        System.out.println("after sort: ");
        for(int num: nums)
        {
            System.out.print(num + " ");
        }
    }

}
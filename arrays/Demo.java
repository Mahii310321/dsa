public class Demo
{
    public static void main(String[] args)
    {


        int nums[]={3,5,6,7,8,9,10,11,12,13};
        int target=12;

        int result = linearSearch(nums, target);
        int result2 = binarySearch(nums, target,0,nums.length-1);
        System.out.println("result2 = " + result2);

        if(result !=-1)
        
            System.out.println("result = " + result);
        else
            System.out.println("not found");

    }

    public static int linearSearch(int[] nums, int target)
    {
        int steps=0;
        for(int i=0;i<nums.length;i++)
        {
            steps++;
            if(nums[i]==target)
            {
                // System.out.println("steps"+steps); 
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] nums, int target,int left,int right)
    {
        // assuming nums is sorted

        if(left<=right)
        {
            int mid=(left+right)/2;

            if(nums[mid]==target)
            {
                 return mid;
            }
            else if(nums[mid]<target)
            {
               return binarySearch(nums, target, mid+1, right);
            }
            else 
            {
               return binarySearch(nums, target, left, mid-1);
            }
        }





        // int steps=0;
        // int left=0;
        // int right=nums.length-1;

        // while(left<=right)
        // {
        //     steps++;
        //     int mid=(left+right)/2;

        //     if(nums[mid]==target)
        //     {
        //         System.out.println("steps"+steps);
        //         return mid;
        //     }
        //     else if(nums[mid]<target)
        //     {
        //         left=mid+1;
        //     }
        //     else 
        //     {
        //         right=mid-1;
        //     }
        // }

        return -1;
    }
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            System.out.println("mid:"+mid);
            if(nums[mid]<target)
            {
                left=mid+1;
                System.out.println("left:"+left);
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
                System.out.println("right:"+right);
            }
            else{
                return mid;
            }
        }
       return right+1;
    }
}
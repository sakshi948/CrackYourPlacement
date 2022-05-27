class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=1,temp=0;
        while(j<nums.length)
        {
            if(nums[i]==0)
            {
                if(nums[j]==0)
                {
                    j++;
                }
                else{
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
            else{
                i++;
                j++;
            }
            
        }
    }
}
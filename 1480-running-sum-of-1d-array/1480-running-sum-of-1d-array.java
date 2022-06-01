class Solution {
    public int[] runningSum(int[] nums) {
        int left=0;
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            left+=nums[i];
            ans[i]=left;
        }
        return ans;
    }
}
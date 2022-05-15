class Solution {
    public boolean canJump(int[] nums) {
        int []dp = new int[nums.length];
        int count=0;
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(dp[i-1]<i) return false;
            dp[i]=Math.max(dp[i-1],i+nums[i]);
        }
        return true;
    }
}
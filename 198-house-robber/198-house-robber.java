class Solution {
    public int robbery(int nums[],int n,int dp[])
    {
        if(n<0){return 0;}
        if(n==0){return dp[n] = nums[0];}
        if(dp[n]!=-1){return dp[n];}
        int taken = nums[n]+robbery(nums,n-2,dp);
        int nottaken = robbery(nums,n-1,dp);
        return dp[n]=Math.max(taken,nottaken);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return robbery(nums,n-1,dp);
    }
}
//tc O(2^n)
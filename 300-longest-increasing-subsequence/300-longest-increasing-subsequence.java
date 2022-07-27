class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        int maxi = 1;
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int prev=0;prev<=i-1;prev++){
                if(nums[prev]<nums[i]){
                    dp[i] = Math.max(dp[i],1+dp[prev]);
                }
            }
            maxi = Math.max(maxi,dp[i]);
        }
        return maxi;
    }
}
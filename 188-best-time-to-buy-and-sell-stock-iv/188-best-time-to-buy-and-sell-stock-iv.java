class Solution {
    public int fn(int ind,int n,int k,int[] arr,int buy,int[][][] dp){
        if(ind==n||k==0){
            return 0;
        }
      
        if(dp[ind][buy][k]!=-1){return dp[ind][buy][k]; }
        if(buy==1){
            return dp[ind][buy][k] = Math.max(fn(ind+1,n,k,arr,0,dp)-arr[ind],fn(ind+1,n,k,arr,1,dp));
        }
        else{
            return dp[ind][buy][k] = Math.max(fn(ind+1,n,k-1,arr,1,dp)+arr[ind],fn(ind+1,n,k,arr,0,dp));
        }
    }
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n][2][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                for(int l=0;l<=k;l++){
                    dp[i][j][l] = -1;
                }
            }
        }
        return fn(0,n,k,prices,1,dp);
    }
}
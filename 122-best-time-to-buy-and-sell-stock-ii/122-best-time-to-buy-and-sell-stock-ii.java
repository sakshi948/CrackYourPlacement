class Solution {
    public int fn(int[] arr,int ind,int n,int buy,int[][] dp){
        if(ind==n){return 0;}
        if(dp[ind][buy]!=-1){return dp[ind][buy];}
        if(buy==1){
            return dp[ind][buy] = Math.max(fn(arr,ind+1,n,0,dp)-arr[ind],fn(arr,ind+1,n,1,dp));
        }
        else{
            return dp[ind][buy] = Math.max(fn(arr,ind+1,n,0,dp),fn(arr,ind+1,n,1,dp)+arr[ind]);
        }
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                dp[i][j]=-1;
            }
        }
        return fn(prices,0,n,1,dp);
    }
}
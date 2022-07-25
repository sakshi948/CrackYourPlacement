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
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int ahead[] = new int[2];
        int cur[] = new int[2];
        ahead[0] = 0;
        ahead[1] = 0;
        int profit = 0;
        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<2;buy++){
                if(buy==1){
                profit = ahead[buy] = Math.max(ahead[0]-arr[ind],ahead[1]);
                }
                else{
                profit = ahead[buy] = Math.max(ahead[0],ahead[1]+arr[ind]);
                }
                cur[buy] = profit;
            }
            ahead = cur;
        }
        return ahead[1];
    }
}
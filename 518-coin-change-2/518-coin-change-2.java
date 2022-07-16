class Solution {
    public int fn(int target,int[] coins,int n,int[][] dp){
        if(n==0){
            if(target%coins[0]==0){return 1;}
            else{return 0;}
        }
        if(dp[n][target]!=-1){return dp[n][target];}
        int notTaken = fn(target,coins,n-1,dp);
        int taken=0;
        if(target>=coins[n]){
            taken = fn(target-coins[n],coins,n,dp);
        }
        return dp[n][target]=taken+notTaken;
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][] = new int[n][amount+1];
        for(int[] num : dp){Arrays.fill(num,-1);}
        return fn(amount,coins,n-1,dp);
    }
}
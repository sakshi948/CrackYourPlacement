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
        for(int[] num : dp){Arrays.fill(num,0);}
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0){dp[0][i]=1;}
            else{dp[0][i]=0;}
        }
        
        for(int ind=1;ind<n;ind++){
            for(int target=0;target<=amount;target++){
                int notTaken = dp[ind-1][target];
                int taken=0;
                if(target>=coins[ind]){
                    taken = dp[ind][target-coins[ind]];
                }
                dp[ind][target]=taken+notTaken;
            }
        }
        return dp[n-1][amount];
    }
}
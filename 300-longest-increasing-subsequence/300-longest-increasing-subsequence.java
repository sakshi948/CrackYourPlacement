class Solution {
    public int fn(int[] arr,int ind,int prev,int n,int[][] dp){
        if(ind==n){return 0;}
        if(dp[ind][prev+1]!=-1){return dp[ind][prev+1];}
        dp[ind][prev+1] = fn(arr,ind+1,prev,n,dp);
        if(prev==-1 || arr[prev]<arr[ind]){   
            dp[ind][prev+1] = Math.max(dp[ind][prev+1],1+fn(arr,ind+1,ind,n,dp));
        }
        return dp[ind][prev+1];
    }
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        int dp[][] = new int[n][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                dp[i][j] = -1;
            }
        }
        return fn(arr,0,-1,n,dp);
    }
}
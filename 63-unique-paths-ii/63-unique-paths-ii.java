class Solution {
    public int f(int [][]arr,int m,int n,int dp[][])
    {
        if(m==0&&n==0&&arr[m][n]==0){return 1;}
        if(m<0||n<0){return 0;}
        if(arr[m][n] == 1){return 0;}
        if(dp[m][n]!=-1){return dp[m][n];}
        int up = f(arr,m-1,n,dp);
        int left = f(arr,m,n-1,dp);
        return dp[m][n] = up+left;
    }
    public int uniquePathsWithObstacles(int[][]arr) {
        int m=arr.length;
        int n=arr[0].length;
        int dp[][] = new int[m][n];
        for(int[] row : dp){Arrays.fill(row,-1);}
        return f(arr,m-1,n-1,dp);
    }
}
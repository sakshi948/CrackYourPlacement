class Solution {
    public int f(List<List<Integer>> triangle,int row,int col,int n,int[][] dp)
    {
        if(row==n){return triangle.get(n).get(col);}
        if(dp[row][col]!=-1){return dp[row][col];}
        int d = triangle.get(row).get(col) + f(triangle,row+1,col,n,dp);
        int dg = triangle.get(row).get(col) + f(triangle,row+1,col+1,n,dp);
        return dp[row][col] = Math.min(d,dg);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[][] = new int[n][n];
        for(int[] num :dp)
        Arrays.fill(num,-1);
        return f(triangle,0,0,n-1,dp);
    }
}
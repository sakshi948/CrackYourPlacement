class Solution {
    public int longestPalindromeSubseq(String s1) {
        String s2 = "";
        int m = s1.length();
        for(int i=m-1;i>=0;i--){
           s2+=s1.charAt(i); 
        }
        int n=s2.length();
        int dp[][] = new int[n+1][m+1];
        int maxi = Integer.MIN_VALUE;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}
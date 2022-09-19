class Solution {
    int[][] dp;
    
	// method to fill dp 2D array with length of LCS
    int lcs(String str1, String str2, int n, int m) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    
	// method to get Shortest Supersequence
    String scs(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i=s1.length(), j=s2.length();
		
		// traversing back the path which we used to get LCS
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                sb.append(s1.charAt(i-1));
                i--;
            }
            else if(dp[i-1][j]<=dp[i][j-1]){
                sb.append(s2.charAt(j-1));
                j--;
            }
            
        }
        while(i>0){
            sb.append(s1.charAt(i-1));
            i--;
        }
        while(j>0){
            sb.append(s2.charAt(j-1));
            j--;
        }
        return sb.reverse()+"";
    }
    
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length(), m=str2.length();
        dp = new int[n+1][m+1];
        for(int i=0; i<n; i++) dp[i][0] = 0;
        for(int j=0; j<m; j++) dp[0][j] = 0;
        lcs(str1, str2, n, m);
        return scs(str1, str2);
    }
}
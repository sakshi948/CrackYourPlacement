class Solution {
    public int minInsertions(String s) {
        String s2 = new String();
        for(int i=s.length()-1;i>=0;i--){
            s2 = s2+s.charAt(i);
        }
        int len = s.length();
        int dp[][] = new int[len+1][len+1];
        
        for(int i=0;i<=len;i++){dp[i][0] = 0;}
        for(int j=0;j<=len;j++){dp[0][j] = 0;}
        
        for(int ind1=1;ind1<=len;ind1++)
        {
            for(int ind2=1;ind2<=len;ind2++){
                if(s.charAt(ind1-1)==s2.charAt(ind2-1)){
                    dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
                }
                else{
                    dp[ind1][ind2] = Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
                }
            }
        }
        return len - dp[len][len];
    }
}
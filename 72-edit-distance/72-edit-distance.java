class Solution {
    public int fn(String s1,String s2,int l1,int l2,int[][] dp){
        if(l1<0){return l2+1;}
        if(l2<0){return l1+1;}
        if(dp[l1][l2]!=-1){return dp[l1][l2];}
        if(s1.charAt(l1)==s2.charAt(l2)){
            return dp[l1][l2] = fn(s1,s2,l1-1,l2-1,dp);
        }
        else{
            return dp[l1][l2] = 1 + Math.min(fn(s1,s2,l1-1,l2,dp),Math.min(fn(s1,s2,l1,l2-1,dp),fn(s1,s2,l1-1,l2-1,dp)));
        }
    }
    public int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int dp[][] = new int[l1][l2];
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                dp[i][j]=-1;
            }
        }
        return fn(word1,word2,l1-1,l2-1,dp);
    }
}
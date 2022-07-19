class Solution {
    public int fn(String s1,String s2,int l1,int l2,int[][] dp)
    {
        if(l1<0||l2<0){
            return 0;
        }
        int two = Integer.MIN_VALUE,one=0;
        if(dp[l1][l2]!=-1){return dp[l1][l2];}
        if(s1.charAt(l1)==s2.charAt(l2)){
            one=1+ fn(s1,s2,l1-1,l2-1,dp);
        }
        else{
            two = 0 + Math.max(fn(s1,s2,l1-1,l2,dp),fn(s1,s2,l1,l2-1,dp));
        }
        return dp[l1][l2] = Math.max(one,two);
        
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int l1=text1.length();
        int l2=text2.length();
        int dp[][] = new int[l1][l2];
        for(int rows[]: dp)
        Arrays.fill(rows,-1);
        return fn(text1,text2,l1-1,l2-1,dp);
    }
}
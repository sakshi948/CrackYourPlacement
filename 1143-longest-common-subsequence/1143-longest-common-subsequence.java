class Solution {
    public int fn(String s,String p,int ind1,int ind2,int dp[][]){
        if(ind1<0||ind2<0){return 0;}
        
        int pick=0,notPick=0;
        if(dp[ind1][ind2]!=-1){return dp[ind1][ind2];}
        if(s.charAt(ind1)==p.charAt(ind2)){
           pick =1+fn(s,p,ind1-1,ind2-1,dp);
        }
        else{
            notPick =0+Math.max(fn(s,p,ind1-1,ind2,dp),fn(s,p,ind1,ind2-1,dp));
        }
        return dp[ind1][ind2] = pick+notPick;
    }
    public int longestCommonSubsequence(String s, String p) {
        int len1=s.length();
        int len2=p.length();
        int dp[][] = new int[len1][len2];
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                dp[i][j]=-1;
            }
        }
        return fn(s,p,len1-1,len2-1,dp);
    }
}
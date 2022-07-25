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
    public int minDistance(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int dp[][] = new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++){
            dp[i][0] = i;
        }
        for(int j=0;j<=l2;j++){
            dp[0][j] = j;
        }
        
        for(int ind1=1;ind1<=l1;ind1++){
            for(int ind2=1;ind2<=l2;ind2++){
                if(s1.charAt(ind1-1)==s2.charAt(ind2-1)){
                    dp[ind1][ind2] = dp[ind1-1][ind2-1];
                }
                else{
                    dp[ind1][ind2] = 1 + Math.min(dp[ind1-1][ind2],Math.min(dp[ind1][ind2-1],dp[ind1-1][ind2-1]));
                }
            }
        }
        return dp[l1][l2];
        
    }
}
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
	if(s1.length() + s2.length() != s3.length())
		return false;

	Boolean[][] memo = new Boolean[s1.length() + 1][s2.length() + 1];

	return helper(s1, s2, s3, 0, 0, memo);
}

public boolean helper(String s1, String s2, String s3, int i, int j, Boolean[][] memo) {
	if(i+j == s3.length())
		return true;

	if(memo[i][j] != null)
		return memo[i][j];

	 if(i < s1.length() && s3.charAt(i+j) == s1.charAt(i)) {
		boolean flag = helper(s1, s2, s3, i+1, j, memo);
		memo[i][j] = flag;
		if(flag) 
			return true;
	}

	if(j < s2.length() && s3.charAt(i+j) == s2.charAt(j)) {
		boolean flag = helper(s1, s2, s3, i, j+1, memo);
		memo[i][j] = flag;
		if(flag) 
			return true;
	}

	memo[i][j] = false;
	return false;
}
}
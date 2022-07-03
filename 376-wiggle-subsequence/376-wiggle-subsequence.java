class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length == 1) return 1; // if length is one answer will be one
        int prevSign = nums[1] - nums[0]; 
        int length = prevSign != 0 ? 2:1;// if we have some difference other than 0 
		//then 1st and 2nd are a part of the sequence therefore length will be 2 otherwise element at 0th or 1st index will alone make a sequence
        for(int i=2;i<nums.length;i++){ //starting with 2nd index 
            int currSign = nums[i] - nums[i-1]; 
            if((currSign > 0 && prevSign <= 0) || (currSign < 0 && prevSign >= 0)){ // if any of the two conditions that the wiggle sequence asks 
			// the equals in prevSign <= 0 && prevSign >=0 can only be used at the first iteration, otherwise prevSign will never be zero afterwards 
                length++; // increase the length 
                prevSign = currSign; // maintaining the prev sign
            }else{
                // not considering the elements or simply removing them from the sequence
            }
        }
        return length;
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
    Set<Integer> set = new HashSet();
    int max =0;
    
    // add all elements to a set.
    for(int i = 0;i<nums.length;i++){
        set.add(nums[i]);
    }
    
    // loop through all elements.
    for(int i=0;i<nums.length;i++){
        // skip if nums[i] is not a start of a sequence.
        if(set.contains(nums[i]-1))
            continue;
        //start counting length of sequence.
        if(set.contains(nums[i])){
            int length =0;
            while(set.contains(nums[i]+length)){
                length++;
            }
            //update max if necessary.
            max = Math.max(max,length);
        }    
    }
    return max;
}  
}
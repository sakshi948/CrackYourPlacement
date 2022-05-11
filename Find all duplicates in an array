class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i=0;
        Arrays.sort(nums);
        while(i<(nums.length-1)){
            if(nums[i] == nums[i+1]){
                res.add(nums[i]);
                i = i+2;
            }else{
                i = i+1;
            }
        }
        return res;
    }
}

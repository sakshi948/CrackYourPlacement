class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int mini = Integer.MAX_VALUE,ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int l = i+1;
            int h = nums.length-1;
            while(l<h){
                
                if(Math.abs(target-(nums[i]+nums[l]+nums[h]))<mini){
                    mini = Math.abs(target-(nums[i]+nums[l]+nums[h]));
                    ans = nums[i]+nums[l]+nums[h];
                }
                
                if(nums[i]+nums[l]+nums[h]>target){
                    h--;
                }
                
                else if(nums[i]+nums[l]+nums[h]<target){
                    l++;
                }
                else {
                    return target;
                }
            }
        }
        return ans;
    }
}



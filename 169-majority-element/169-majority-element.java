class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]))
            {
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i],1);
            }
        } 
        int i=nums.length/2,result=0;
        for(HashMap.Entry<Integer,Integer> entry : mp.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();
            
            if(value>i){
                result=key;
            }
        }
        return result;
    }
}
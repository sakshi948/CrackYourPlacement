class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }
        int a = pq.poll();
        int b = pq.poll();
        return (a-1)*(b-1);
    }
}
class Solution {
    public int trap(int[] height) {
        int l=height[0],r=0;
        int maxr[] = new int[height.length];
        maxr[height.length-1] = height[height.length-1];
        int ans=0;
        
        for(int i=height.length-2;i>=0;i--){
            maxr[i] = Math.max(height[i],maxr[i+1]);
        }
        
        for(int i=0;i<height.length;i++){
            // max element on the left 
            l = Math.max(l,height[i]);
            // max element on the right 
            r = maxr[i];
            
            int diff = Math.min(l,r)-height[i];
            if(diff>0){
                ans+=diff;
            }
        }
        return ans;
    }
}
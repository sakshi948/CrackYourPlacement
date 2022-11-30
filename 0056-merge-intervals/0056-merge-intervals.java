class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> list = new ArrayList<>(); 
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for(int i=1;i<intervals.length;i++){
            if(end>=intervals[i][0]){
                end = Math.max(end,intervals[i][1]);
            }
            else{
                list.add(new int[]{start,end}); 
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        list.add(new int[]{start,end});            
        return list.toArray(new int[list.size()][2]);  
    }
}
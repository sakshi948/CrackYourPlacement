class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int check =0 ;
        for(int i=0;i<gas.length;i++){
            check+=gas[i]-cost[i];
        }
        if(check<0){return -1;}
        int start=0,curr=0;
        for(int i=0;i<gas.length;i++){
            curr += gas[i]-cost[i];
            if(curr<0){
                start=i+1;
                curr=0;
            }
        }
        return start;
    }
}
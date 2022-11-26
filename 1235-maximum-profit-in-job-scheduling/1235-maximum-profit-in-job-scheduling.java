class Solution {
    Integer[] dp;
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = profit.length;
        int[][] arr = new int[n][3];
        dp = new Integer[n+1];
        for(int i=0; i<n; i++){
            arr[i]=new int[]{startTime[i],endTime[i],profit[i]};
        }
        Arrays.sort(arr,(a,b)-> a[0]-b[0]);
       for(int i=0; i<n; i++){
             System.out.println(Arrays.toString(arr[i]));
        }
        return dfs(arr,0,n);
    }
    public int dfs(int[][] arr, int i,int n){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=null){
            return dp[i];
        }
        int notTake = dfs(arr,i+1,n);
        int newI = binarySearch(arr,i+1,n-1,arr[i][1]);
        int take = arr[i][2]+ dfs(arr,newI,n);
        return dp[i] = Math.max(notTake,take);
    }
    public int binarySearch(int[][] arr,int low,int high, int target){
        int ans = -1;
        while(low<=high){
            int mid =(high+low)/2;
            if(arr[mid][0]==target){
                ans = mid;
                high = mid-1;
            }else if(arr[mid][0]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(ans!=-1) return ans;
        return low;
    }
}
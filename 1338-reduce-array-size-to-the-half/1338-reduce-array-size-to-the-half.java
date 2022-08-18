class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(var v:hm.keySet()){
            pq.add(hm.get(v));
        }
        int ans=0,set=0;
        while(set<(arr.length)/2){
            set+=pq.poll();
            ans++;
        }
        return ans;
    }
}
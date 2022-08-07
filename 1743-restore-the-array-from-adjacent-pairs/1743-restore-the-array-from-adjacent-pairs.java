class Solution {
    public int[] restoreArray(int[][] arr) {
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
           if(!hm.containsKey(arr[i][0])){
               hm.put(arr[i][0],new ArrayList<>());
               hm.get(arr[i][0]).add(arr[i][1]);
           }
            else{
                hm.get(arr[i][0]).add(arr[i][1]);
            }
            
            if(!hm.containsKey(arr[i][1])){
               hm.put(arr[i][1],new ArrayList<>());
               hm.get(arr[i][1]).add(arr[i][0]);
           }
            else{
                hm.get(arr[i][1]).add(arr[i][0]);
            }
        }
        int size = hm.size(); 
       int corner=0;
        for(var v : hm.keySet()){
            if(hm.get(v).size()==1){
                corner = v;
                break;
            }
        }
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        
        for(int i=0;i<size;i++){
            ArrayList<Integer> ret = hm.get(corner);
            hs.add(corner);
            for(var v:ret){
                if(hs.add(v)){
                    corner = v;
                }
            }
        }
        
        int arrsize = hs.size();
        int arr1[] = new int[arrsize];
        int i=0;
        for(var v:hs){
            arr1[i] = v;
            i++;
        }
        return arr1;
    }
}
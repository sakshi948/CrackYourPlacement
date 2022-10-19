class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        if(words == null || words.length <= 0) {return new ArrayList<>();}
        List<String> al = new ArrayList<>();
        
        Map<String,Integer> frequency = new HashMap<>();
        Map<Integer,Set<String>> reverse = new TreeMap<>(Collections.reverseOrder()); 
        
        for(String s : words) {
            int freq = frequency.getOrDefault(s,0);
            frequency.put(s,freq+1);
        }
        for(Map.Entry<String,Integer> entry: frequency.entrySet()) {
            Set<String> set = reverse.getOrDefault(entry.getValue(), new TreeSet<String>());
            set.add(entry.getKey());
            reverse.put(entry.getValue(),set);
        }
        for(Map.Entry<Integer,Set<String>> entry: reverse.entrySet()) {
            for(String s : entry.getValue()) {
                al.add(s);
                k--;
                if(k <= 0) break;
            }
            if(k <= 0) break;
        }
        return al;
        
    }
}
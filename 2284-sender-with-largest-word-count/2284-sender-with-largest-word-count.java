class Solution {
    public static int num(String str) {
        if(str.trim().isEmpty()) {
            return 0;
        }
        int wordCount = 1;
        int len = str.length();
        for(int i = 0; i < len-1; i++) {
           if(str.charAt(i) == ' ') { 
                wordCount++;
           }
        }
        return wordCount;
    }
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> hm  = new HashMap<>();
        int n = senders.length;
        for(int i = 0; i<n;i++){
            if(hm.containsKey(senders[i]))
                hm.put(senders[i],hm.get(senders[i])+num(messages[i]));
            else
                hm.put(senders[i],num(messages[i]));
                
            
            
        }
        int ans = Integer.MIN_VALUE;
        String s = "";
        for(var v : hm.keySet()){
            if(hm.get(v) > ans){
                ans = hm.get(v);
                s = v;
            }
            else if(hm.get(v) == ans && v.compareTo(s) > 0)
            {
                s = v;
            }
        }
        
        return s;
        
        
        
    }
}
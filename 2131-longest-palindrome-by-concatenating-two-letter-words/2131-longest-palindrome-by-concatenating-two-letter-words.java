class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words){
            if(map.containsKey(word)){
                map.replace(word, map.get(word),map.get(word)+1);
            }
            else map.put(word,1);
        }
		
        int len =0, mid=0;
		
        for(Map.Entry<String, Integer> e: map.entrySet()){
            String s = e.getKey().charAt(1)+""+e.getKey().charAt(0);
            if(s.equals(e.getKey())){
                if(e.getValue()%2==0){
                    len+= e.getValue()*2;
                }
                else{
                    len+=(e.getValue()-1)*2;
                    mid =1;
                }
            }
            else if(map.containsKey(s)){
                len += Math.min(map.get(s), e.getValue())*4;
                map.replace(s,0);
                map.replace(e.getKey(),0);
            }
        }
        len +=mid*2;
        return len;
    }
}
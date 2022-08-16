class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
            else{
                mp.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> ans = new HashSet<>();
        ArrayList<String> al = new ArrayList<>();
        int l=0,r=10;
        HashSet<String> hs = new HashSet<>();
        while(r<=s.length()){
            if(hs.contains(s.substring(l,r))){
                ans.add(s.substring(l,r));
            }
            else{
            hs.add(s.substring(l,r));
            }
            l++;
            r=l+10;
        }
        for(String ele : ans){
            al.add(ele);
        }
        return al;
    }
}
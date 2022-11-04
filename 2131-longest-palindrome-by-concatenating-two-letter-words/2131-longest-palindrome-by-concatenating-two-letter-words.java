class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> dis = new HashMap<>();
        HashMap<String,Integer> same = new HashMap<>();
        
        for(int i=0;i<words.length;i++){
            if(words[i].charAt(0)==words[i].charAt(1))
                same.put(words[i],same.getOrDefault(words[i],0)+1);
            else
                dis.put(words[i],dis.getOrDefault(words[i],0)+1);
        }
        // System.out.println(same);
        // System.out.println(dis);
        int freq=0,maxi=0,count=0,flag=0;
        for(var v:words){
            if(dis.containsKey(v)){
                String rev = v.charAt(1)+""+v.charAt(0);
                if(dis.containsKey(rev)){
                    freq+=(4*(Math.min(dis.get(v),dis.get(rev))));
                    dis.remove(rev);
                    dis.remove(v);
                }
            }
            else{
                if(same.getOrDefault(v,0)%2==0){
                    count+=(2*same.getOrDefault(v,0));
                    same.remove(v);
                }
                else{
                    if(flag==0){
                        maxi+=same.getOrDefault(v,0);
                        flag=1;
                    }
                    else{
                        if(same.getOrDefault(v,0)>0){
                        maxi+=same.getOrDefault(v,0)-1;
                        }
                    }
                    same.remove(v);
                }
            }
        }
     //   System.out.println(count+" "+maxi);
        return freq+count+maxi*2;
    }
}
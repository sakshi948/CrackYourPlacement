class Solution {
    public String breakPalindrome(String s) {
        if(s.length()==1){
            return "";
        }
        if(s.charAt(0)!='a'){
            // s= "bcddcb"
            return 'a' + s.substring(1);
        }
        int i=0;
        for(i=0;i<s.length();i++){
            //abccba
            if(s.charAt(i)!='a'){
                break;
            }
        }
        if(i==s.length()){
            return s.substring(0,s.length()-1) + 'b';
        }
        if(i==s.length()/2){
            return s.substring(0,s.length()-1) + 'b';
        }
        return s.substring(0,i) + 'a' + s.substring(i+1);
    }
}
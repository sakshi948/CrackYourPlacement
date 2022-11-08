class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        int i=1;
        while(i<s.length()){
            if(st.size()>0&&Math.abs((int)s.charAt(i)-(int)st.peek())==32){
                st.pop();
                i++;
            }
            else{
                st.push(s.charAt(i));
                i++;
            }
        }
        String ans="";
        while(!st.isEmpty()){
           ans=st.pop()+ans; 
        }
        return ans;
    }
}
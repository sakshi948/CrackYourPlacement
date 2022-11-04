class Solution {
    public String reverseVowels(String s) {
        String ext="";
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('I');
        hs.add('O');
        hs.add('E');
        hs.add('U');
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))){
                ext+=s.charAt(i);
            }
        }
        
        String rev = new String(new StringBuilder(ext).reverse());
        int j=0;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(arr[i])){
                arr[i] = rev.charAt(j);
                j++;
            }
        }
        
        return new String(arr);
    }
}
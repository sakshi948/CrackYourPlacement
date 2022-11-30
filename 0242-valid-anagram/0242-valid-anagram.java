class Solution {
    public boolean isAnagram(String s, String t) {
        char s1[] = s.toCharArray();
        char s2[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String str1 = new String(s1);
        String str2 = new String(s2);
        if(str1.equals(str2)) return true;
        return false;
    }
}
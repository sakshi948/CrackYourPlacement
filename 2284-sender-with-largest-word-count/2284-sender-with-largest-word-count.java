class Solution {
    public static int count(String str)
    {
        if(str.trim().isEmpty()) {
            return 0;
        }
        int wordCount = 1;
        int len = str.length();
        for(int i = 0; i < len-1; i++) {
           if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') { 
                wordCount++;
           }
        }
        return wordCount;
    }
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<senders.length;i++)
        {
            if(hm.containsKey(senders[i]))
            {
                hm.put(senders[i],hm.get(senders[i])+count(messages[i]));
            }
            else{
                hm.put(senders[i],count(messages[i]));
            }
        }
        int ans=Integer.MIN_VALUE;
        String s=" ";
        for(var v:hm.keySet())
        {
            if(hm.get(v)>ans)
            {
                ans=hm.get(v);
                s=v;
            }
            else if(hm.get(v)==ans)
            {
                if(v.compareTo(s)>0)
                {
                    s=v;
                    ans=hm.get(v);
                }
            }
        }
            return s;
    }
}
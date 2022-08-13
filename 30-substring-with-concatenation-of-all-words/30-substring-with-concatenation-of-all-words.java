class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> wordsMap = getWordsMap(words);
        
        int wordsLength = words[0].length();
        int len = s.length();
        int subStringsize = wordsLength * words.length;
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < len - subStringsize + 1; i++) {
            Map<String, Integer> currentWordsMap = new HashMap<>(wordsMap);
            if(canSubstringBeFormed(s, i, len, wordsLength, currentWordsMap)) {
                result.add(i);
            }
        }
        
        return result;
    }
    
    boolean canSubstringBeFormed(String s, int currentIndex, int len, int wordsLength, Map<String, Integer> currentWordsMap) {
        
        if(currentWordsMap.isEmpty()) {
            return true;
        }
        
        for(int i = currentIndex; i + wordsLength <= len; i++) {
            String currentWord = s.substring(i, i + wordsLength);
            if(currentWordsMap.containsKey(currentWord)) {
                remove(currentWord, currentWordsMap);
                return canSubstringBeFormed(s, i + wordsLength, len, wordsLength, currentWordsMap);
            }
            return false;
        }
        
        return false;
    }
    
    Map<String, Integer> getWordsMap(String[] words) {
        Map<String, Integer> wordsMap = new HashMap<>();
        
        for(String word : words) {
            wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1); 
        }
        
        return wordsMap;
    }
    
    void remove(String word, Map<String, Integer> wordsMap) {
        wordsMap.put(word, wordsMap.getOrDefault(word, 0) - 1); 
        if(wordsMap.get(word) == 0) {
            wordsMap.remove(word);
        }
    }
}
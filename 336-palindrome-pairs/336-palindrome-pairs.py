class Solution:
    def palindromePairs(self, nums: List[str]) -> List[List[int]]:
        def is_peli(s):
            if s == s[::-1]:
                return True
            return False
        ans = set()   
        back_word = {n[::-1]:i for i,n in enumerate(nums)}
        for i,n in enumerate(nums):
            if n in back_word and i != back_word[n]:
                ans.add((i,back_word[n]))
            if n != '' and is_peli(n) and '' in back_word:
                ans.add((i,back_word['']))
                ans.add((back_word[''],i))
            if n != '':
                for j in range(1,len(n)):
                    if n[:j] in back_word and is_peli(n[j:]) :
                        ans.add((i,back_word[n[:j]]))
                    if n[j:] in back_word and is_peli(n[:j]):
                        ans.add((back_word[n[j:]],i))       
            
        return ans
class Solution {
    public int maximum69Number (int num) {
        
        int add = 0;
        int step = 1;
        int tmp = num;
        
        while(tmp > 0) {
            int d = tmp%10;
            tmp /= 10;
            
            if (d==6) {
                add = 3*step;
            }
            step*=10;
        }
        return num+add;
    }
}
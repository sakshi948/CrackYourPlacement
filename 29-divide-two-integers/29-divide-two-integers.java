class Solution {
    public int divide(int dividend, int divisor) {
        //The answer will be negative if either the dividend or divisor is negative, but not both
        boolean negate = divisor < 0 ^ dividend < 0;
        
        //Handle edge cases
        if(dividend == Integer.MIN_VALUE && (divisor == 1 || divisor == -1)) {
            if(negate) {
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
        
        //start the quotient at 0
        int quotient = 0;
        
        //If the divident is -2147483648, we need to move it closer to 0, so it'll fit in the positive range of an int
        //so do the first round of long division
        if(dividend == Integer.MIN_VALUE ) {
            if(divisor > 0)
               dividend += divisor;
            else
                dividend -= divisor;
            quotient++;
        }
        
        //change the divisor and the dividend to positive values
        if(divisor < 0) {
            divisor = -divisor;
        }
        if(dividend < 0) {
            dividend = -dividend;
        }
        
        //Do long division by subtraction
        while(dividend > 0) {
            dividend -= divisor;
            quotient++;
        }
        
        //We overshot by 1 if there was a remainder
        if(dividend != 0) {
            quotient--;
        }
        
        //Perform negation on the quotient, if necessary
        if(negate) {
            quotient = -quotient;
        }
        
        return quotient;
        
    }
}
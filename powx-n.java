// Time Complexity : O(logN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public double myPow(double x, int n) {
        //case n < 0
        long N = n;
        if(n<0)
        {
            //if(x == 0) return Double.POSITIVE_INFINITY;
            x=1/x;
            N=-1*n;
        }
        return power(x, N);
    }
    //helper method
    private double power(double x, long n){
        //case n = 0
        if(n == 0) return 1;
        //case n == 1
        if(n == 1) return x;
        double value = power(x, n/2);
        if(n % 2 == 0){
            return value*value;
        } else {//odd
            return x*value*value;
        }
    }
}

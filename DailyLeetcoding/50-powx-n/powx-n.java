class Solution {
    public double myPow(double x, int n) {
        if(n >= 0){
            return helper(x, n);
        }
        return 1 / helper(x, Math.abs(n));
    }
    private static double helper(double x, int n){
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n % 2 == 0){
            double ans = helper(x, n / 2);
            return ans * ans;
        } else {
            double ans = helper(x, n / 2);
            return ans * ans * x;
        }
    }
}
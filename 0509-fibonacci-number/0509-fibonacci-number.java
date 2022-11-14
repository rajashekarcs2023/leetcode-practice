class Solution {
    public int fib(int n) {
        return nthFib(n);
        
    }
    private int nthFib(int n){
        if(n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return nthFib(n-1)+nthFib(n-2);
    }
}
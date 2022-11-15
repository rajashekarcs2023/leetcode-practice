class Solution {
    public int tribonacci(int n) {
        HashMap<Integer,Integer> memo = new HashMap<>();
            return nthTrib(n, memo);
        
        
    }
    
    private int nthTrib(int n, HashMap<Integer, Integer> memo){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 1;
        
        int currentKey = n;
        
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        int a = nthTrib(n-1,memo);
        int b = nthTrib(n-2,memo);
        int c = nthTrib(n-3,memo);
        
        memo.put(currentKey, a+b+c);
        
        return a+b+c;
        
        
        
    }
}
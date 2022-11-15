class Solution {
    public int rob(int[] nums) {
        HashMap<Integer,Integer> memo = new HashMap<>();
        return maxRob(nums,0, memo);
        
    }
    private int maxRob(int[] nums, int currentHouse, HashMap<Integer,Integer> memo){
        
        if(currentHouse >= nums.length)
            return 0;
        
        int currentKey = currentHouse;
        
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        int rob = nums[currentHouse] + maxRob(nums,currentHouse+2, memo);
        int noRob = maxRob(nums,currentHouse+1,memo);
        
        memo.put(currentKey, Math.max(rob,noRob));
        
        return Math.max(rob,noRob);        
        
    }
}
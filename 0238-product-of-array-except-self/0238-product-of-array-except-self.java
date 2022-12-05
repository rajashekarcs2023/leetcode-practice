class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int totalProd = 1;
        int n = nums.length;
        int[] prod = new int[n];
        int flag = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                flag++;
            }
            else{
            totalProd = totalProd * nums[i];
            }
        }
        for(int i = 0;i<n;i++){
            if(flag>1){
                prod[i]=0;
            }
            else if(flag == 1){
                if(nums[i] == 0){
                    prod[i] = totalProd;
                }
                else{
                    prod[i] = 0;
                }
            }
            else{
                prod[i] = totalProd/nums[i];
            }
        }
        return prod;
        
    }
}
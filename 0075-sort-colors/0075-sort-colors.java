class Solution {
    public void sortColors(int[] nums) {
        
    int i=0,j=0,k=nums.length - 1;
        
    while(j<=k){
        if(nums[j] == 0){
            swap(nums,i,j);
            i++;
            j++;
        }
        else if(nums[j] == 2){
            swap(nums,j,k);
            k--;
        }
        else{
            j++;
        }
        
        
        
    }
    }
    public void swap(int[] arr, int pointer1, int pointer2){
        int temp = arr[pointer1];
        arr[pointer1] = arr[pointer2];
        arr[pointer2] = temp;
    }
        
        
    
}
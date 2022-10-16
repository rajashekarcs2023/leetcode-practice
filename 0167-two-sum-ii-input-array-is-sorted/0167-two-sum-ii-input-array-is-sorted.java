import java.util.*;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int fPoint = 0, sPoint = numbers.length - 1;
        int[] answer = new int[2];
        while(fPoint < sPoint){
            if(numbers[fPoint] + numbers[sPoint] < target)
                fPoint++;
            else if(numbers[fPoint] + numbers[sPoint] > target)
                sPoint--;
            else{
                answer[0] = fPoint + 1;
                answer[1] = sPoint + 1;
                break;
            }
            
            
        }
        return answer;
}
}
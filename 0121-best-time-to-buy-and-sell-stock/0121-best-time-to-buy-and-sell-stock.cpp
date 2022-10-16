class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int answer = 0;
        int minimumSofar = prices[0];
        for(int i=1;i<prices.size();i++){
            int currentProfit = prices[i] - minimumSofar;
            if(currentProfit > answer){
                answer = currentProfit;
            }
            minimumSofar = min(minimumSofar, prices[i]);
        }
        return answer;
            
            
            
            
        }
        
    
};
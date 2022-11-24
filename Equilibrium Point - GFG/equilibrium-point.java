//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

           long totalSum = 0,lhs =0,rhs=0;
            int equiPoint = 0;
            boolean flag = false;
            for(int i=0;i<=arr.length-1;i++){
                totalSum+=arr[i];
            }
            for(int i = 0; i<=arr.length-1;i++){
                if(i-1>=0){
                  lhs += arr[i-1];
                 // System.out.println(i+"l"+lhs);
                }
                    
                rhs = totalSum - lhs - arr[i];
               // System.out.println(i+"r"+rhs);
                
                if(lhs == rhs){
                    equiPoint = i;
                    flag = true;
                    break;
                }
                
                
            }
            if(flag == false)
                return -1;
            else
                return equiPoint+1;
       
            
    }
    
    
    public static int arrSum(int start, int end, long arr[]){
        int sum = 0;
        for(int i=start;i<=end;i++){
            sum+=arr[i];
        }
        
        
        return sum;
    
    }
    
}
/*int equiPoint = 0,sumPrev=0, sumNext=0;
        
        boolean flag = false;
       
        if(arr.length == 1)
            return arr.length;
            
        for(int i=0; i<= arr.length-1; i++){
            if((i-1)>=0) {
                sumPrev = arrSum(0,i-1,arr);
               //System.out.println(i +"P"+sumPrev);
            }
            if(i+1<=arr.length){
                sumNext = arrSum(i+1,arr.length-1,arr);
               //System.out.println(i+"N"+sumNext);
            }
            if(sumPrev == sumNext){
                equiPoint = i;
                flag = true;
                break;   
            }
                
                
        }
        if(flag == false)
            return -1;
        else
            return equiPoint+1;*/

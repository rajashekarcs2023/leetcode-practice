//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        
       ArrayList<Integer> posList = new ArrayList<>();
       ArrayList<Integer> negList = new ArrayList<>();
       
       for(int i = 0; i<n;i++){
           if(arr[i]>=0){
               posList.add(arr[i]);
           }else{
               negList.add(arr[i]);
           }
       }
       
       int pos = 0;
       int neg = 0;
       int index = 0;
       while(pos < posList.size() && neg < negList.size()){
           arr[index++] = posList.get(pos++);
           arr[index++] = negList.get(neg++);
           
       }
       while(pos < posList.size()){
           arr[index++] = posList.get(pos++);
       }
       while(neg < negList.size()){
           arr[index++] = negList.get(neg++);
       }
       
       
       
       
       
    }  
       
       
       
       
       
       
       
        /*int[] posArr = new int[n/2 + 1];
        int[] negArr = new int[n/2 + 1];
        int j = 0,k=0;
        for(int i = 0; i < n; i++){
            if(arr[i]>=0){
            while(j<n){    
                posArr[j] = arr[i];
                j++;
                break;
            }
            
            }
            else{
            while(k<n){    
                negArr[k] = arr[i];
                k++;
                break;
            }
            k++;
           
            }
            
        
    }
   for(int i = 0; i<n ; i++){
          arr[i] = posArr[i];
          //System.out.print(negArr[i]);
   }
    }   */
}
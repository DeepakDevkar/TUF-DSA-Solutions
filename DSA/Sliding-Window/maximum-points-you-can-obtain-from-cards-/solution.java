class Solution {
  
    public int maxScore(int[] cardScore, int k) 
    {

        int lSum = 0, rSum = 0, maxSum = 0;
 
       
        for (int i = 0; i < k; i++) 
        {
            lSum += cardScore[i];
            maxSum = lSum;
        }
 
        
        int rightIndex = cardScore.length - 1;
        
        for (int i = k - 1; i >= 0; i--) {
            
           
            lSum -= cardScore[i];   
            rSum += cardScore[rightIndex];  
            rightIndex--; 
 
           
            maxSum = Math.max(maxSum, lSum + rSum);
        }
 
       
        return maxSum; 
    }
}
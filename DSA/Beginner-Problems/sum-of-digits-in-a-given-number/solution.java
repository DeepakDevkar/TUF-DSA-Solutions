class Solution {

    
    public int addDigits(int num) {
    
         if (num < 10) {
            return num;
        }

        
        int sum = sumDigits(num);

        return addDigits(sum);
    }
    
    
    private int sumDigits(int num) 
    {
       
        if (num == 0) return 0;

       
        return sumDigits(num / 10) + (num % 10);
    }
}
class Solution {
    public boolean checkPrime(int num) {
       
        if (num <= 1) {
            return false; 
        }
       
        return prime(num, 2); 
    }

    private boolean prime(int num, int x) {
        if (x > Math.sqrt(num)) {
            return true; 
        }
       
        if (num % x == 0) {
            return false; 
        }
       
        return prime(num, x + 1); 
    }
}
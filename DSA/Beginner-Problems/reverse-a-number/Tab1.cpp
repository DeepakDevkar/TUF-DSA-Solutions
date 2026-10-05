class Solution {
public:
    int reverseNumber(int n) {

          int reverse=0;
        int digit=0;
        while(n!=0)
        {
            digit= n % 10;
            reverse=reverse * 10 + digit;
            
            n=n/10;
            
        }


        return reverse;

    }
};
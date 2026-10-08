class Solution 
{
    public int getLength(ListNode head) 
    {
        
         int count=0;
        
          
            while(head != null)
            
            {
                count++;
                head= head.next;

            }

            return count;


        }
    }
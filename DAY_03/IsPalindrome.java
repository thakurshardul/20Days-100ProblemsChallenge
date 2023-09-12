Palindrome Number

Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-2^31 <= x <= 2^31 - 1
 

Follow up: Could you solve it without converting the integer to a string?

====================================================================================================================================================================================================================
                                                                           Approach 1 ( Reversing the integer and then comparing it with original one ) 
====================================================================================================================================================================================================================

class Solution {
    public boolean isPalindrome(int x) {
      if(x<0){
            return false;
        }
        int temp=x;int rev=0;
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(temp==rev){
            return true;
        }
        else return false;
    }
}

====================================================================================================================================================================================================================
                                                                  Approach 2 ( Coverting integer into String and then comparing its indices )
====================================================================================================================================================================================================================

  class Solution {
    public boolean isPalindrome(int x) {
        String str=x+"";
        int length=str.length();
        int i=0;int j=length-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

}

====================================================================================================================================================================================================================

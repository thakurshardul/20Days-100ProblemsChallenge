/*
Majority Element    (  https://leetcode.com/problems/majority-element/   )

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-10^9 <= nums[i] <= 10^9
=======================================================================================================================================================================================================================
                                                                           Approach 1 (Time Complexity :- O(N^2) && Space Complexity :- O(1)  )
=======================================================================================================================================================================================================================
  */

class Solution {
    public int majorityElement(int[] nums) {
         int res=nums[0]; int maxCount=1;
        for(int i=0;i<nums.length;i++){
            
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    
                }
            }
            if(count>=maxCount){
                maxCount=count;
                res=nums[i];
            }
           

        }
        return res; 
    }
}

/*==================================================================================================================================================================================================================
                                                                        Approach 2(Time Complexity :- O(N*logN) && Space Complexity :- O(1)   )
==================================================================================================================================================================================================================*/
import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            int baseVal=nums.length/2;
            return nums[baseVal];
    }
}

/*==================================================================================================================================================================================================================
                                                                      Approach 2(Time Complexity :- O(N) && Space Complexity :- O(1)   )
 =================================================================================================================================================================================================================*/




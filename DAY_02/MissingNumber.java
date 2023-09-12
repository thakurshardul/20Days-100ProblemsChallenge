/*
Missing Number     (   https://leetcode.com/problems/missing-number/   )

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 

Constraints:

n == nums.length
1 <= n <= 10^4
0 <= nums[i] <= n
All the numbers of nums are unique.
====================================================================================================================================================================================================================

==================================================================================================================================================================================================================*/

import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int maxElement=nums[nums.length-1];
        int expSum=findSum(maxElement);
        int orgSum=0;
        for(int i=0;i<nums.length;i++){
            orgSum=orgSum+nums[i];
        }
        if(expSum-orgSum>0){
            return expSum-orgSum;
        }
        else {
            if(nums[0]!=0){
                return 0;
            }
            else{
                return nums[nums.length-1]+1;
            }
        }
   }
    public int findSum(int n){
       
        int res=0;
        for(int i=0;i<=n;i++){
            res=res+i;
        }
        return res;
    }
}

/*==================================================================================================================================================================================================================

==================================================================================================================================================================================================================*/


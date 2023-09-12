/*
Move Zeroes   (   https://leetcode.com/problems/move-zeroes/    )

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 10^4
(-2^31) <= nums[i] <= (2^31) - 1

======================================================================================================================================================================================================================
                                                                            Approach 1(Time Complexity :- O(N) && Space Complexity :- O(1)
====================================================================================================================================================================================================================*/

class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount=0;int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        for(int i=nums.length-zeroCount;i<nums.length;i++){
            nums[i]=0;
        }

    }
}

/*================================================================================================================================================================================================================*/

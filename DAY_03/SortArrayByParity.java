Sort Array By Parity  (   https://leetcode.com/problems/sort-array-by-parity/    )

Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

 

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 5000
0 <= nums[i] <= 5000

==============================================================================================================================================================================================================================================================
                                              2 pointer Approach with O(N) Time Complexity & O(1) Space Complexity
==============================================================================================================================================================================================================================================================

  class Solution {
    public int[] sortArrayByParity(int[] nums) {
     if(nums==null||nums.length==1){
         return nums;
     }
        int i=0;int j=nums.length-1;
        while(i<j){
            if(nums[i]%2==0){
                i++;
            }
            else if(nums[j]%2!=0){
                j--;
            }
            else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return nums;
    }
}

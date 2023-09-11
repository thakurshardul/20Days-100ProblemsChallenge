/*
Plus One  (https://leetcode.com/problems/plus-one/)

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.

====================================================================================================================================================================================================================
                                                                             Approach 1 (Using Coupling & Decoupling)
====================================================================================================================================================================================================================

*/


import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits){
          BigInteger one=new BigInteger("1");
          BigInteger num=couple(digits).add(one);
          return decouple(num);
    }
   public static BigInteger couple(int[] arr){
        BigInteger inc=new BigInteger("1");
        BigInteger sum=new BigInteger("0");BigInteger j=new BigInteger("0");
        for(int i=arr.length-1;i>=0;i--){
            BigInteger arrContent=new BigInteger(arr[i]+"");
            sum=sum.add(arrContent.multiply(pow(j)));
            j=j.add(inc);
        }
        return sum;
    }
     public static int[] decouple(BigInteger num){
        //int nums=(int) num;
        BigInteger zero=new BigInteger("0");
        BigInteger one=new BigInteger("1");
        BigInteger ten=new BigInteger("10");
        int i=num.toString().length();
        int[] res=new int[i];
        while(num.compareTo(zero)==1){
            res[i-1]=(num.mod(ten)).intValue();
            num=num.divide(ten);
            i--;
        }
        return res;
    }
     public static BigInteger pow(BigInteger i){
        BigInteger one=new BigInteger("1");
        if(i.intValue()==0){
            return one;
        }
        BigInteger smallerOutput=pow(i.subtract(one));
        BigInteger mul=new BigInteger("10");
        return smallerOutput.multiply(mul);
   }
}

/*
====================================================================================================================================================================================================================
                                                                          Approach 2 (Much Simpler and sleek Solution)
====================================================================================================================================================================================================================
*/


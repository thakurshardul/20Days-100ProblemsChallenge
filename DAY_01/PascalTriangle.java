/*                   (https://leetcode.com/problems/pascals-triangle/)

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

img src="https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif"
 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30
====================================================================================================================================================================================================================
                                                                        Approach 1 ( not very optimal solution , can be optimised better )
====================================================================================================================================================================================================================
*/

import java.math.BigInteger;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList  = new ArrayList<List<Integer>>(numRows);
        for(int i=0;i<numRows;i++){
            List<Integer> innerList  = new ArrayList<>(i+1);
            for(int j=0;j<=i;j++){
                innerList.add(nCr(i,j));
            }
            outerList.add(innerList);
        }
        return outerList;
    }
    public static int nCr(int n, int r){
        return (fact(n).divide(fact(r).multiply(fact(n-r))).intValue());
    }
    public static BigInteger fact(int n){
        BigInteger one=new BigInteger("1");
        if(n==0){
            return one ;
        }
        BigInteger res=one;
        BigInteger counter=one;
        while(counter.intValue()<=n){
            res=res.multiply(counter);
            counter=counter.add(one);
        }
        return res;
    }
}
/*
====================================================================================================================================================================================================================
*/

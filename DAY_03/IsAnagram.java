Valid Anagram  (   https://leetcode.com/problems/valid-anagram/description/   )

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

====================================================================================================================================================================================================================

====================================================================================================================================================================================================================

  class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr1=new int[125];
        int[] arr2=new int[125];
        for(int i=0;i<s.length();i++){
            arr1[s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++){
            arr2[t.charAt(i)]++;
        }
        for(int i=97;i<=122;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}

====================================================================================================================================================================================================================
                                                                         Lesser Length Of Array been used in this approach
====================================================================================================================================================================================================================
 class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr1=new int[30];
        int[] arr2=new int[30];
        for(int i=0;i<s.length();i++){
            arr1[s.charAt(i)-97]++;
        }
        for(int i=0;i<t.length();i++){
            arr2[t.charAt(i)-97]++;
        }
        for(int i=0;i<30;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}

====================================================================================================================================================================================================================

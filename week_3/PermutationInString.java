/*
Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.

 */
class Solution {
    public boolean countZero(int[] arr)
    {
        for(int i=0;i<26;i++)
            if(arr[i]!=0)
                return false;

        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;

        int[] countS1 = new int[26];
        int len1 = s1.length();
        int len2 = s2.length();

        for(int i=0;i<s1.length();i++){
            countS1[s2.charAt(i)-97]++;
            countS1[s1.charAt(i)-97]--;
        }



        for(int i=len1; i<len2; i++){
            if(countZero(countS1))
                return true;

            countS1[s2.charAt(i)-97]++;
            countS1[s2.charAt(i-len1)-97]--;

        }
        if(countZero(countS1))
            return true;

        return false;
    }
}
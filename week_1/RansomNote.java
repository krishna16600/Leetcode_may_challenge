/*
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[256];

        for(int i=0;i<magazine.length();i++)
            arr[magazine.charAt(i)]++;

        for(int i=0;i<ransomNote.length();i++)
        {
            if(arr[ransomNote.charAt(i)]==0)
                return false;

            if(arr[ransomNote.charAt(i)]>0)
                arr[ransomNote.charAt(i)]--;
        }
        return true;
    }
}

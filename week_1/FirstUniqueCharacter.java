/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.


 */
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;

        for(char c='a';c<='z';c++)
        {
            int index = s.indexOf(c);

            if(index!=-1 && index==s.lastIndexOf(c))
                ans = Math.min(ans,index);
        }

        return ans==Integer.MAX_VALUE?-1:ans;
    }
}

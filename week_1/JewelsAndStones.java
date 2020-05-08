import java.util.HashMap;

/*
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Input: J = "aA", S = "aAAbbbb"
Output: 3

 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character,Integer> hs = new HashMap<>();

        //putting string S with character and its count
        for(int i=0;i<S.length();i++)
        {
            if(hs.containsKey(S.charAt(i)))
                hs.put(S.charAt(i),hs.get(S.charAt(i))+1);
            else
                hs.put(S.charAt(i),1);
        }

        //iterating over J to check if S has same jwel or not and if yes, then how many
        int ans=0;
        for(int i=0;i<J.length();i++)
            if(hs.containsKey(J.charAt(i)))
                ans+=hs.get(J.charAt(i));

        return ans;

    }
}

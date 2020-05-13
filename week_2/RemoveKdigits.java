/*
Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.
 */
public class RemoveKdigits {
    public String removeKdigits(String num, int k) {
        if(num.length()==k)
            return "0";

        StringBuilder sb = new StringBuilder(num);

        for(int i=0;i<k;i++){
            int j=0;
            while(j<sb.length()-1 && sb.charAt(j) <= sb.charAt(j+1)){
                j++;
            }
            sb.delete(j,j+1);

        }


        while(sb.length() > 1 && sb.charAt(0)=='0')
            sb.delete(0,1);

        if(sb.length()==0)
            return "0";

        return sb.toString();


    }
}

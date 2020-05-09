/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.
The problem could be solved easily using BINARY SEARCH.
The solution given below has O(log(sqrt(n))
 */
public class CheckPerfectSquare {
    public boolean checkPerfect(int num){
        long high = 100000;
        long low = 1;

        while(low <= high){
            long mid = low + (high-low)/2;
            if(mid*mid==num)
                return true;
            else if(mid*mid > num){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}

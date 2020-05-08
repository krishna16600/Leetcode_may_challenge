/*
Given a positive integer num, output its complement number. The complement strategy is to flip the bits of its binary representation.
ip: 5
op: 2
 */
public class NumberComplement {
    public int findComplement(int num) {
        int comp = num;
        int sum = 0;
        while(num!=0){
            sum = (sum<<1)+1;
            num>>=1;
            System.out.println(sum);

        }
        return sum-comp;
    }
}

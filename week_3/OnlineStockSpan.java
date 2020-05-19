import java.util.*;
class StockSpanner {
    Stack<Integer> prices;
    Stack<Integer> span;
    public StockSpanner() {
        prices = new Stack<Integer>();
        span = new Stack<Integer>();
    }

    public int next(int price) {
        int count = 1;

        while(!prices.isEmpty() && price>=prices.peek()){
            prices.pop();
            count+=span.pop();
        }

        prices.push(price);
        span.push(count);

        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
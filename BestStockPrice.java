package leetcode;

public class BestStockPrice {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int lowestPrice = 10000;

        for (int price : prices) {

            lowestPrice = Math.min(lowestPrice, price);
            int currentProfit = price - lowestPrice;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}

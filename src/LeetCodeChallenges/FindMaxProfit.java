package LeetCodeChallenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindMaxProfit {

    public void maxProfit(int[] prices) {

            if (prices == null || prices.length <= 1) {
                System.out.println(0);
            }

            int minPrice = prices[0];
            int maxProfit = 0;

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                } else {
                    maxProfit = Math.max(maxProfit, prices[i] - minPrice);
                }
            }

        System.out.println(maxProfit);
        }


    public static void main(String[] args) {

        FindMaxProfit findMaxProfit = new FindMaxProfit();

        int[] prices = {7,9,5,1,3,6,9,4};
        findMaxProfit.maxProfit(prices);

    }
}

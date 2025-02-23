package LeetCode.Q200;

public class Q121 {

  public static int maxProfit(int[] prices) {
    if (prices.length <= 1) {
      return 0;
    }
    int min = prices[0], max = 0;
    for (int i = 1; i < prices.length; i++) {
      max = Math.max(max, prices[i] - min);
      min = Math.min(min, prices[i]);
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}

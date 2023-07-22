import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxProfitTest1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 7;
        int actual = new Solution().maxProfit(prices);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxProfitTest2() {
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4;
        int actual = new Solution().maxProfit(prices);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maxProfitTest3() {
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;
        int actual = new Solution().maxProfit(prices);

        Assert.assertEquals(expected, actual);
    }
}

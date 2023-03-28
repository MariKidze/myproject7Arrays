import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    void testAllSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.AllSumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void testAverageAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        int actualSum = service.AverageAmount(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void testMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 8;
        int actualSum = service.MaxSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void testMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 9;
        int actualSum = service.minSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void testCountMonthMin() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 5;
        int actualSum = service.countMonthMin(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void testCountMonthMax() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 5;
        int actualSum = service.countMonthMax(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void sumMonthSales() {
        StatsService service = new StatsService();

        long[] income = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sumSales(income);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avgMonthSales() {
        StatsService service = new StatsService();

        long[] income = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.avgSales(income);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonthSales() {
        StatsService service = new StatsService();

        long[] income = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxSales(income);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonthSales() {
        StatsService service = new StatsService();

        long[] income = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minSales(income);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minAvgSales() {
        StatsService service = new StatsService();

        long[] income = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minAvgSales(income);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxAvgSales() {
        StatsService service = new StatsService();

        long[] income = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxAvgSales(income);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}

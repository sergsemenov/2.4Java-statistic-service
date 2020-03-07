package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calcAnnualSalesSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calcAnnualSalesSum(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calcAnnualAverage() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.calcAnnualAverage(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calcBestMonth() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.calcBestMonth(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calcWorstMonth() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.calcWorstMonth(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calcMonthsBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.calcMonthsBelowAverage(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calcMonthsAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.calcMonthsAboveAverage(monthlySales);
        assertEquals(expected, actual);
    }
}
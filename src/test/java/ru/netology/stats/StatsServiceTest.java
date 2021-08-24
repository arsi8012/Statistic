package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calcSum(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calcAverage(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 6;
        long actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNumberMonthOverAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.numberMonthOverAverage(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNumberMonthUnderAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numberMonthUnderAverage(sales);

        assertEquals(expected, actual);
    }
}
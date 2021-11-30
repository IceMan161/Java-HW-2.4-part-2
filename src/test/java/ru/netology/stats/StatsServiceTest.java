package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void sumSalesAllSales() {
        StatsService statsService = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = statsService.findSum(monthlySales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void averageAmountSalesPerMonth() {
        StatsService statsService = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = statsService.findAverage(monthlySales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void maxSale() {
        StatsService statsService = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = statsService.findMaxSale(monthlySales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minSales() {
        StatsService statsService = new StatsService();

        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = statsService.findMinSales(monthlySales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void salesBelowAverage() {
        StatsService statsService = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = statsService.findSalesBelowAverage(monthlySales);

        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void salesAboveAverage() {
        StatsService statsService = new StatsService();

        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = statsService.findSalesAboveAverage(monthlySales);

        assertEquals(expected, actual);
    }


}
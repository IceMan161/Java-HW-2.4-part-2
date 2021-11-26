package ru.netology.stats;

public class StatsService {
    public int findSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int findAverage(int[] sales) {return findSum(sales) / sales.length;}


    public int findMaxSale(int[] sales) {
        int max = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[max])
                max = month;
            month = month + 1;
        }
        return max + 1;
    }


    public int findMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int findSalesBelowAverage (int[] sales) {
        int average = findAverage(sales);
        int sum = 0;
        for (int sale : sales) {
            if (sale<average)
                sum ++;

        }return sum;
    }


    public int findSalesAboveAverage (int[] sales) {
        int average = findAverage(sales);
        int sum = 0;
        for (int sale : sales) {
            if (sale>average)
                sum ++;
        }return sum;
    }


}

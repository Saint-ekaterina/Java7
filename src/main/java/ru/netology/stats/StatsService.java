package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sumSales = 0; // начальная сумма
        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }
        return sumSales;
    }

    public long avgSales(long[] sales) {
        long totalSales = sumSales(sales);
        return totalSales / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int minAvgSales(long[] sales) {
        long avgSales = avgSales(sales);
        int amountMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avgSales) {
                amountMonth++;
            }
        }
        return amountMonth;
    }

    public int maxAvgSales(long[] sales) {
        long avgSales = avgSales(sales);
        int amountMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avgSales) {
                amountMonth++;
            }
        }
        return amountMonth;
    }
}

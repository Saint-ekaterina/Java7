package ru.netology.stats.Java7.services;

//номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
public class StatsService {
    public long minSales(long[] sales) {
        long minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales [(int) minMonth]); {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public long maxSales(long[] sales) {
        long maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[(int) maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //сумма всех продаж
    public long sumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    //средняя сумма продаж в месяц
    public long averageSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum / sales.length;
    }

    //количество месяцев, в которых продажи были выше среднего
    public long moreAverageSales(long[] sales) {
        long averageSales = averageSales(sales);
        long moreSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSales < sales[i]) {
                moreSales ++;
            }
        }
        return moreSales;
    }

    //количество месяцев, в которых продажи были ниже среднего
    public long lessAverageSales(long[] sales) {
        long averageSales = averageSales(sales);
        long lessSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSales > sales[i]) {
                lessSales ++;
            }
        }
        return lessSales;
    }
}

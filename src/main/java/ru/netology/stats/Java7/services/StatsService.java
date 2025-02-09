package ru.netology.stats.Java7.services;

//номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //сумма всех продаж
    public int sumSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += (int) sales[i];
        }
        return sum;
    }

    //средняя сумма продаж в месяц
    public int averageSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += (int) sales[i];
        }
        return sum / sales.length;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int moreAverageSales(long[] sales) {
        int averageSales = averageSales(sales);
        int moreSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSales < sales[i]) {
                moreSales ++;
            }
        }
        return moreSales;
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int lessAverageSales(long[] sales) {
        int averageSales = averageSales(sales);
        int lessSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSales > sales[i]) {
                lessSales ++;
            }
        }
        return lessSales;
    }
}

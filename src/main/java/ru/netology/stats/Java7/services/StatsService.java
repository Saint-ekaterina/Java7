package ru.netology.stats.Java7.services;

//номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
public class StatsService {
    public int minSales(long[] sales) {
        long minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[(int) minMonth]) {
                minMonth = i;
            }
        }
        return (int) (minMonth + 1);
    }

    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(long[] sales) {
        long maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[(int) maxMonth]) {
                maxMonth = i;
            }
        }
        return (int) maxMonth + 1;
    }

    //сумма всех продаж
    public int sumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += (int) sales[i];
        }
        return (int) sum;
    }

    //средняя сумма продаж в месяц
    public int averageSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += (int) sales[i];
        }
        return (int) (sum / sales.length);
    }

    //количество месяцев, в которых продажи были выше среднего
    public int moreAverageSales(long[] sales) {
        long averageSales = averageSales(sales);
        long moreSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSales < sales[i]) {
                moreSales ++;
            }
        }
        return (int) moreSales;
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int lessAverageSales(long[] sales) {
        long averageSales = averageSales(sales);
        long lessSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (averageSales > sales[i]) {
                lessSales ++;
            }
        }
        return (int) lessSales;
    }
}

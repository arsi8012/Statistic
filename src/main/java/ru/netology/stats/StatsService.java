package ru.netology.stats;

public class StatsService {
    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calcAverage(long[] sales) {
        long sum = calcSum(sales);
        long sumAverage = sum / sales.length;
        return sumAverage;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int index = 0;
        for (long sale : sales) {
            if (sale > sales[maxMonth]) {
                maxMonth = index;
            }
            index = index + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long numberMonthOverAverage(long[] sales) {
        int numberMonth = 0;
        int calcAverage = 15;
        for (long sale : sales) {
            if (sale <= calcAverage) {
                numberMonth = numberMonth + 1;
            }
        }
        return numberMonth;
    }

    public long numberMonthUnderAverage(long[] sales) {
        int numberMonth = 0;
        int calcAverage = 15;
        for (long sale : sales) {
            if (sale > calcAverage) {
                numberMonth = numberMonth + 1;
            }
        }
        return numberMonth;
    }
}

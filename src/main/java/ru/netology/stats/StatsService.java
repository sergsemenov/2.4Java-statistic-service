package ru.netology.stats;

public class StatsService {

    public int calcAnnualSalesSum(int[] monthlySales) {
        //улучшенный цикл for-each
        int annualSum = 0;
        for (int monthlySale : monthlySales) {
            annualSum += monthlySale;
        }
        return annualSum;
    }

    public int calcAnnualAverage(int[] monthlySales) {
        int annualSum = 0;
        for (int monthlySale : monthlySales) {
            annualSum += monthlySale;
        }
        return annualSum / monthlySales.length;
    }

    public int calcBestMonth(int[] monthlySales) {
        //попробуем while
        int salesMax = monthlySales[0];
        int i = 1;
        int monthOfMaxSales = 1;
        while (i < monthlySales.length) {
            if (monthlySales[i] >= salesMax) {
                salesMax = monthlySales[i];
                monthOfMaxSales = i + 1;
            }
            i++;
        }
        return monthOfMaxSales;
    }

    public int calcWorstMonth(int[] monthlySales) {
        //цикл for(-each) простой
        int salesMin = monthlySales[0];
        int monthOfMinSales = 1;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] < salesMin) {
                salesMin = monthlySales[i];
                monthOfMinSales = i + 1;
            }
        }
        return monthOfMinSales;
    }

    public int calcMonthsBelowAverage(int[] monthlySales) {
        int average = calcAnnualAverage(monthlySales);
        int monthsAboveCounter = 0;
        for (int monthlySale : monthlySales) {
            if (monthlySale > average) {
                monthsAboveCounter++;
            }
        }
        return monthsAboveCounter;
    }

    public int calcMonthsAboveAverage(int[] monthlySales) {
        int average = calcAnnualAverage(monthlySales);
        int monthsBelowCounter = 0;
        for (int monthlySale : monthlySales) {
            if (monthlySale < average) {
                monthsBelowCounter++;
            }
        }
        return monthsBelowCounter;
    }
}



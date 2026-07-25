package com.cognizant.forecasting;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double predictFutureValue(double currentValue,
                                            double growthRate,
                                            int years) {

        if (years == 0) {
            return currentValue;
        }

        return predictFutureValue(
                currentValue,
                growthRate,
                years - 1
        ) * (1 + growthRate);
    }
}
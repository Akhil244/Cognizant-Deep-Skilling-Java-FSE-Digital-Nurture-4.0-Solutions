public class FinancialForecast {

    // Recursive method to calculate future value
    // futureValue = presentValue * (1 + rate)^years
    public static double predictFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) return presentValue;
        return (1 + growthRate) * predictFutureValue(presentValue, growthRate, years - 1);
    }

    // Optimized version using memoization (optional)
    public static double predictWithMemo(double presentValue, double growthRate, int years, double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = (1 + growthRate) * predictWithMemo(presentValue, growthRate, years - 1, memo);
        return memo[years];
    }
}

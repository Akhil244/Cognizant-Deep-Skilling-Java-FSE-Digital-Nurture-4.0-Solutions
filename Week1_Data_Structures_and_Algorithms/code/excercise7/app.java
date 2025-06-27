import java.util.Scanner;

// Recursion is a programming technique where a method calls itself.

// Useful for breaking down problems like factorial, Fibonacci, tree traversal, and compounding calculations.

// Example:
// Future Value = P * (1 + r)^n
// Can be defined recursively as:
// F(n) = (1 + r) * F(n - 1)
// with F(0) = P.

// Using the compound interest formula recursively:

// 𝐹𝑉=10000×(1+0.10)^5=10000×1.61051=16105.10

// Both the recursive and memoized versions produce the same result, but memoization is more efficient for large inputs.


// Time Complexity Analysis
// Version	Time Complexity	Space Complexity	Notes
// Simple Recursion	O(n)	O(n)	Stack builds up with each call
// With Memoization	O(n)	O(n)	Avoids recomputation using storage


// Optimization Tip
// Memoization stores previously computed results.

// Prevents exponential blow-up in deeper recursive trees (like in Fibonacci, though not required for pure exponentiation).



public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Financial Forecasting Tool ===");
        System.out.print("Enter present value (₹): ");
        double presentValue = sc.nextDouble();

        System.out.print("Enter annual growth rate (in %): ");
        double ratePercent = sc.nextDouble();
        double growthRate = ratePercent / 100.0;

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        // Recursive calculation
        double future = FinancialForecast.predictFutureValue(presentValue, growthRate, years);
        System.out.printf("\nPredicted future value (Recursive): ₹%.2f\n", future);

        // Optimized with memoization
        double[] memo = new double[years + 1];
        double optimized = FinancialForecast.predictWithMemo(presentValue, growthRate, years, memo);
        System.out.printf("Predicted future value (Memoized): ₹%.2f\n", optimized);

        sc.close();
    }
}

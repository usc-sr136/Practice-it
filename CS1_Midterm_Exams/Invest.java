/*
 *  Write a method named 'invest' that computes the interest earned on a financial investment.
 *  Once per year, the bank pays interest to the investor at a given fixed rate.
 *  As the investment earns interest, that interest is added to the investment
 *  and therefore the interest begins earning interest of its own ("compounding").
 *
 *  Your method should accept three parameters:
 *  the initial amount of the investment in dollars (as a real number such as 1500.0 for $1,500.00),
 *  the yearly interest rate (as a real number such as 3.5 for 3.5% interest)
 *  and the number of years for which to invest (as an integer such as 6 for 6 years).
 *
 *  Your method should print the value of the investment after each year,
 *  as well as the total amount of interest earned over all years.
 *  For example, an investment of $100.00 at 10% interest for 5 years would lead to this call:
 *
 *   invest(100.00, 10.0, 5);        // $100.00 at 10% interest for 5 years
 *
 *  The call would produce the following console output. Dollar amounts print with 2 digits after the decimal.
 *
 *   After year 1: $110.00
 *   After year 2: $121.00
 *   After year 3: $133.10
 *   After year 4: $146.41
 *   After year 5: $161.05
 *   Total interest earned: $61.05
 *
 *  Notice that we are not simply adding 10% of $100.00 (or $10.00) each year; that would lead to $50 of total interest earned.
 *  The first year adds 10% of $100.00, but the second year adds 10% of $110.00, or $11.00, leading to a total of $121.00.
 *  The third year adds 10% of $121.00, or $12.10, leading to a total of $133.10. The interest is cumulative.
 *
 *  You may assume that all parameter values passed are non-negative.
 *
 */
class Invest {
    public static void main(String[] args) {
       invest(100.00, 10.0, 5);
    }

    public static void invest(double investment, double rate, int year) {
        double total = 0.0;
        for (int i = 1; i <= year; i++) {
            double result = investment * (1.0 + rate/100.0);
            double interest = result - investment;
            total += interest;
            System.out.printf("After year %d: $%.2f\n", i, result);
            investment = result;
        }
        System.out.printf("Total interest earned: $%.2f\n", total);
    }
}

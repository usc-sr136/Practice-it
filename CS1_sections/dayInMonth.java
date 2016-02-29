/*
 * Write a method named daysInMonth that accepts a month (an integer between 1 and 12) as a parameter
 * and returns the number of days in that month in this year.
 * For example, the call daysInMonth(9) would return 30 because September has 30 days.
 * Assume that the code is not being run during a leap year (that February always has 28 days).
 */

class dayInMonth{
    public static void main(String[] args) {
        System.out.println(daysInMonth(1));
        System.out.println(daysInMonth(2));
        System.out.println(daysInMonth(3));
        System.out.println(daysInMonth(4));
        System.out.println(daysInMonth(5));
        System.out.println(daysInMonth(6));
        System.out.println(daysInMonth(7));
        System.out.println(daysInMonth(8));
        System.out.println(daysInMonth(9));
        System.out.println(daysInMonth(10));
        System.out.println(daysInMonth(11));
        System.out.println(daysInMonth(12));
    }


    public static int daysInMonth(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month ==10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
           return 30;
        } else {
            return 28;
        }
    }
}

/*
 * Write a method named 'repeatQuote' that accepts a String s and an integer n as parameters
 * and outputs the string s repeated n times, separated by colons, with backslashes around the overall line of output.
 * For example, the call:
 *
 * repeatQuote("hello", 4)
 *
 * should produce the following console output:
 *
 * \hello:hello:hello:hello\
 *
 * The number n of times to repeat can be any integer. If it is less than or equal to 0, print nothing between the backslashes.
 * The calls:
 *
 * repeatQuote("goodbye", 1);
 * repeatQuote("booyah", 0);
 *
 * should produce the following console output:
 *
 * \goodbye\
 * \\
 *
 */

class Quote {
    public static void main(String[] args) {
        repeatQuote("hello", 4);
        repeatQuote("goodbye", 1);
        repeatQuote("booyah", 0);
    }

    public static void repeatQuote(String s, int n) {
            if (n == 0) {
                System.out.println("\\\\");
            } else if (n == 1) {
                System.out.println("\\" + s + "\\");
            } else {
                System.out.print("\\" + s);
                for (int i = 1; i < n; i++) {
                    System.out.print(":" + s);
                }
                System.out.println("\\");
            }
    }
}


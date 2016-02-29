/*
 *
 * Write a method named printMultiples that accepts an integer n and an integer m as parameters
 * and that prints a complete line of output reporting the first m multiples of n.
 * For example, the following calls:
 *
 * printMultiples(3, 5);
 * printMultiples(7, 3);
 *
 * should produce the following output:
 *
 * The first 5 multiples of 3 are 3, 6, 9, 12, 15
 * The first 3 multiples of 7 are 7, 14, 21
 *
 *  Notice that the multiples are separated by commas. You must exactly reproduce this format.
 *  You may assume that the number of multiples you will be asked to generate is greater than or equal to 1.
 *
 */


class Multiples{
    public static void main(String[] args) {
        printMultiples(3, 5);
        printMultiples(7, 3);
    }

    public static void printMultiples(int m, int n){

        System.out.print("The first " +  n + " multiples of " + m + " are ");

        for (int i = 1; i < n; i++) {
            System.out.print(m*i + ", ");
        }

        System.out.println(m*n);
    }
}

/*
 *
 * Write a method named 'hopscotch' that accepts an integer parameter for a number of "hops"
 * and prints a hopscotch board of that many hops.
 * A "hop" is defined as the split into two numbers and then back together again into one.
 * For example, hopscotch(3); should print:
 *    1
 * 2     3
 *    4
 * 5     6
 *    7
 * 8     9
 *    10
 *
 */

class Hops {
    public static void main(String[] args) {
        hopscotch(3);
    }

    public static void hopscotch(int n) {
        for (int i = 1; i <= 3 * n + 1; i++) {
            if(i % 3 == 1){
                System.out.println("   " + i);
            } else if (i % 3 == 2){
                System.out.print(i + "     ");
            } else {
                System.out.println(i);
            }
        }
    }
}

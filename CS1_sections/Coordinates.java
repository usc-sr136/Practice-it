/* Rewrite the coordinates method below by factoring to eliminate redundancy. Your code must produce the same results.
 *
 * public static double getCoordinates(Scanner console) {
 *      System.out.print("x coordinate? ");
 *      double x = console.nextDouble();
 *      int neg;
 *      if (x < 0.0) {
 *          System.out.print("y coordinate? ");
 *          double y = console.nextDouble();
 *          if (y < 0.0) {
 *              neg = 2;
 *              System.out.println("negatives = " + neg);
 *              return x + y + neg;
 *          }  else {
 *              neg = 1;
 *              System.out.println("negatives = " + neg);
 *              return x + y + neg;
 *          }
 *      } else {
 *          System.out.print("y coordinate? ");
 *          double y = console.nextDouble();
 *          if (y < 0.0) {
 *              neg = 1;
 *              System.out.println("negatives = " + neg);
 *              return x + y + neg;
 *          }  else {
 *              neg = 0;
 *              System.out.println("negatives = " + neg);
 *              return x + y + neg;
 *          }
 *      }
 *  }
 */

import java.util.*;

class Coordinates{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        getCoordinates(console);
    }


    public static double getCoordinates(Scanner console) {
        System.out.print("x coordinate? ");
        double x = console.nextDouble();
        int neg;
        System.out.print("y coordinate? ");
        double y = console.nextDouble();
        if (x < 0.0 && y < 0.0) {
            neg = 2;
            System.out.println("negatives = " + neg);
            return x + y + neg;
        }
        else if (x < 0.0 && y >= 0.0) {
            neg = 1;
            System.out.println("negatives = " + neg);
            return x + y + neg;
        }
        else if (x >= 0.0 && y < 0.0) {
                neg = 1;
                System.out.println("negatives = " + neg);
                return x + y + neg;
        }
        else {
                neg = 0;
                System.out.println("negatives = " + neg);
                return x + y + neg;
        }
    }
}

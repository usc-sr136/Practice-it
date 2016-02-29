/*
 * Write a method named hasMidpoint that accepts three integers as parameters
 * and returns true if one of the integers is the midpoint between the other two integers;
 * that is, if one integer is exactly halfway between them.
 * Your method should return false if no such midpoint relationship exists.
 * The integers could be passed in any order; the midpoint could be the 1st, 2nd, or 3rd. You must check all cases.
 *
 * Calls such as the following should return true:
 * hasMidpoint(4, 6, 8)
 * hasMidpoint(2, 10, 6)
 * hasMidpoint(8, 8, 8)
 * hasMidpoint(25, 10, -5)
 *
 * Calls such as the following should return false:
 * hasMidpoint(3, 1, 3)
 * hasMidpoint(1, 3, 1)
 * hasMidpoint(21, 9, 58)
 * hasMidpoint(2, 8, 16)
 *
 */

class Midpoint{
    public static void main(String[] args) {
        System.out.println(hasMidpoint(4,6,8));
        System.out.println(hasMidpoint(2,10,6));
        System.out.println(hasMidpoint(8,8,8));
        System.out.println(hasMidpoint(25,10,-5));

        System.out.println(hasMidpoint(3,1,3));
        System.out.println(hasMidpoint(1,3,1));
        System.out.println(hasMidpoint(21,9,58));
        System.out.println(hasMidpoint(2,8,16));

    }

    public static boolean hasMidpoint(int x, int y, int z){
        if (x > y && y > z) {
            int max_num = x;
            int min_num = z;
            return (x + z) / 2 == y;
        } else if (y > x && x > z) {
            int max_num = y;
            int min_num = z;
            return (y + z) / 2 == x;
        } else if (z > y && y > x){
            int max_num = z;
            int min_num = x;
            return (z + x) / 2 == y;
        } else if (z > x && x > y) {
            int max_num = z;
            int min_num = y;
            return (z + y) / 2 == x;
        } else if (y > z && z > x) {
            int max_num = y;
            int min_num = x;
            return (y + x) / 2 == z;
        } else if (x > z && z > y) {
            int max_num = x;
            int min_num = y;
            return (x + y) / 2 == z;
        } else if (x == y && y  == z) {
            return true;
        } else {
           return false;
        }

    }

}

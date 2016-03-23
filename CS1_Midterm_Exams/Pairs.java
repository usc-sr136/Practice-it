/*
 * Write a static method named 'anglePairs' that accepts three angles (integers), measured in degrees, as parameters
 * and returns whether or not there exists both complementary and supplementary angles amongst the three angles passed.
 * Two angles are complementary if their sum is exactly 90 degrees;
 * two angles are supplementary if their sum is exactly 180 degrees.
 * Therefore, the method should return true if any two of the three angles add up to 90 degrees
 * and also any two of the three angles add up to 180 degrees;
 * otherwise the method should return false. You may assume that each angle passed is non-negative.
 *
 * Here are some example calls to the method and their resulting return values.
 *
 * Call                         Value Returned
 * anglePairs(0, 90, 180)       true
 * anglePairs(45, 135, 45)      true
 * anglePairs(177, 87, 3)       true
 * anglePairs(120, 60, 30)      true
 * anglePairs(35, 60, 30)       false
 * anglePairs(120, 60, 45)      false
 * anglePairs(45, 90, 45)       false
 * anglePairs(180, 45, 45)      false
 */

class Pairs {
    public static void main(String[] args) {
        System.out.println(anglePairs(0, 90, 180));
        System.out.println(anglePairs(45, 135, 45));
        System.out.println(anglePairs(177, 87, 3));
        System.out.println(anglePairs(120, 60, 30));
        System.out.println(anglePairs(35, 60, 30));
        System.out.println(anglePairs(120, 60, 45));
        System.out.println(anglePairs(45, 90, 45));
        System.out.println(anglePairs(180, 45, 45));
    }

    public static boolean anglePairs(int a, int b, int c) {
        if ( (a + b == 90 || b + c == 90 || c + a == 90) && (a + b == 180 || b + c == 180 || c + a == 180) ) {
            return true;
        } else {
            return false;
        }
    }
}

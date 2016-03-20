/*
 * Write a static method 'closerDistance' that takes two pairs of integers, x1 and y1 and x2 and y2,
 * representing two ordered pairs (x1, y1) and (x2, y2) on an x-y plane.
 * Your method should calculate each pairs, the distance from the origin (0, 0)
 * and return the closer of the two distances as a real number.
 * If the two points are the same distance from the origin, you may return either of the two distances, since they are equal.
 *
 * For example, the point (12, 5) has a distance of 13.0 from the origin,
 * and the point (9, 9) has a distance of 12.727922061357855 from the origin,
 * so a call to closerDistance(12, 5, 9, 9) would return 12.727922061357855.
 * Notice your method should not do any rounding.
 *
 * Recall that the formula to find the distance between a point (x, y) and the origin is equal to the square root of (x2 + y2).
 *
 */

class Distance {
    public static void main(String[] args) {
        System.out.println(closerDistance(12, 5, 9, 9));
    }

    public static double closerDistance(int x1, int y1, int x2, int y2) {
        double d1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double d2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        if (d1 > d2) {
            return d2;
        } else {
            return d1;
        }
    }
}

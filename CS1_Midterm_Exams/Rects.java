/*
 * Write a method named 'randomRects' that calculates and displays the area of randomly-generated rectangles.
 * The width and height of each rectangle should be a randomly generated integer between 1 and 10 inclusive.
 * Your method should keep generating random rectangles until an increasing sequence of four areas is printed.
 * In other words, if the last four rectangles generated have areas of a1, a2, a3 and a4 such that a1 < a2 < a3 < a4,
 * the method should print the final message and stop.
 * So your method will generate at least 4 total rectangles but possibly many more,
 * stopping only when it sees 4 in a row with areas in increasing order.
 *
 * The following calls demonstrate your method's behavior. Your method should match this output format exactly:
 *
 * randomRects();
 * w: 5, h: 6, area: 30
 * w: 10, h: 5, area: 50
 * w: 2, h: 8, area: 16
 * w: 4, h: 4, area: 16
 * w: 2, h: 9, area: 18
 * w: 8, h: 3, area: 24
 * w: 7, h: 2, area: 14
 * w: 3, h: 10, area: 30
 * w: 7, h: 9, area: 63
 * w: 9, h: 8, area: 72
 * Four rectangles of increasing area.
 */


import java.util.*;
class Rects {
    public static void main(String[] args) {
        randomRects();

    }

    public static void randomRects() {
        Random rnd = new Random();
        int weight, height, area1;
        int area2 = 0;
        int counter = 0;
        while(counter < 4) {
            weight = rnd.nextInt(10) + 1;
            height = rnd.nextInt(10) + 1;
            area1 = weight * height;
            System.out.printf("w: %d, h: %d, area: %d\n", weight, height, area1);
            if (area2 < area1) {
                area2 = area1;
                counter++;
            } else {
                area2 = area1;
                counter = 0;
            }
        }
        System.out.println("Four rectangles of increasing area.");
    }
}

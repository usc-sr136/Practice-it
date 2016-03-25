/*
 * Write a method flip that takes a Random object as a parameter and that prints information about a coin-flipping simulation.
 *
 * Your method should use the Random object to produce a sequence of simulated coin flips,
 * printing whether each flip comes up "heads" or "tails". Each outcome should be equally likely.
 * Your method should stop flipping when you see three heads in a row.
 *
 * For example, if we construct a Random object and make the following calls:
 * Random r = new Random();
 * flip(r);
 * flip(r);
 *
 * We expect to get a log of execution like this:
 *
 * heads
 * tails
 * heads
 * heads
 * heads
 * 3 heads in a row after 5 flips
 *
 * heads
 * heads
 * tails
 * heads
 * tails
 * tails
 * heads
 * heads
 * heads
 * 3 heads in a row after 9 flips
 *
 *  (Because this problem uses random numbers, our test cases check only the general format of your output.
 *  You must still examine the output yourself to make sure the answer is correct.)
 *
 */
import java.util.*;

class Flip {
    public static void main(String[] args) {
        Random r = new Random();
        flip(r);
        flip(r);
    }

    public static void flip(Random r) {
        int count = 0;
        int counter = 0;
        while (count < 3) {
            int f = r.nextInt(2);
            counter++;
            if (f == 0) {
                System.out.println("heads");
                count++;
            } else {
                System.out.println("tails");
                count = 0;
            }
        }
        System.out.println(count + " heads in a row after " + counter + " flips");
    }
}

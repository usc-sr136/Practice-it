/*
 * Write a method named 'cheerleader' that accepts two integer parameters 'lines' and 'cheers'
 * and prints a series of "cheer" lines at increasing levels of indentation.
 * The first parameter represents the number of lines of output to print,
 * and the second represents the number of "cheers" per line.
 * For example, the call of cheerleader(2, 4) means that you should print 2 lines of output, each containing 4 "cheers."
 * A "cheer" is an occurrence of the word "Go" in the output. Neighboring cheers are separated by the word "Team",
 * so 1 cheer is printed as "Go", 2 cheers as "Go Team Go", 3 cheers are printed as "Go Team Go Team Go", and so on.
 *
 * The lines you print should be displayed at increasing levels of indentation.
 * The first line displayed should have no indentation,
 * but each following line should be intended by 3 spaces more than the one before it.
 * In other words, the 2nd line of output should be indented by 3 spaces, the 3rd line by 6 spaces, and so on.
 *
 * You may assume that both parameters passed your method will have values of at least 1.
 * The following calls demonstrate your method's behavior. Your method should match this output format exactly:
 *
 * cheerleader(2, 1);
 * Go
 *    Go
 *
 * cheerleader(4, 3);
 * Go Team Go Team Go
 *    Go Team Go Team Go
 *       Go Team Go Team Go
 *          Go Team Go Team Go
 *
 */

class Leader {
    public static void main(String[] args) {
        cheerleader(4, 3);
        System.out.println();
        cheerleader(8, 6);
    }

    public static void cheerleader(int lines, int cheers) {
        for (int i = 0; i < lines; i++) {
            for (int s = 0; s < i * 3; s++) {
                System.out.print(" ");
            }

            System.out.print("Go ");

            for (int j = 0; j < cheers - 1; j++) {
                System.out.print("Team Go ");
            }

            System.out.println();
        }
    }
}

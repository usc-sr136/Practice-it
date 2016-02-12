/*
 * Write a method named sequenceSum that prints terms of the following mathematical sequence:
 * 1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 ...
 *
 * Your method should accept a real number as a parameter representing a limit, and should add and print terms of the sequence until the sum of terms meets or exceeds that limit.
 * For example, if your method is passed 2.0, print terms until the sum of those terms is at >= 2.0. You should round your answer to 3 digits past the decimal point.
 *
 * The following is the output from the call sequenceSum(2.0);
 *
 * 1 + 1/2 + 1/3 + 1/4 = 2.083
 *
 * (Despite the fact that the terms keep getting smaller, the sequence can actually produce an arbitrarily large sum if enough terms are added.)
 * If your method is passed a value less than 1.0, no output should be produced.
 * You must match the output format shown exactly; note the spaces and pluses separating neighboring terms.
 *
 * Other sample calls:
 * sequenceSum(1.0);
 * 1 = 1.000
 *
 * sequenceSum(1.5);
 * 1 + 1/2 = 1.500
 *
 * sequenceSum(2.7);
 * 1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + 1/7 + 1/8 = 2.718
 *
 */

class Sequence{
    public static void main(String[] args) {
        sequenceSum(0.0);
        sequenceSum(1.0);
        sequenceSum(1.5);
        sequenceSum(2.7);
    }

    public static void sequenceSum(double num) {
        double sum = 0.0;
        int counter = 1;

        if (num >= 1.0) {
            System.out.print(counter);
            while (sum < num) {
                sum += (double) 1 / counter;
                counter++;
                if (sum < num) {
                    System.out.print(" + " + "1/" + counter);
                }
            }
                System.out.printf(" = %.3f\n", sum);
        }
    }
}

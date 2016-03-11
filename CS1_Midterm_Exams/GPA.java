/*
 * Write a method named 'graduation' that accepts a student's GPA, total credit count, and honors credit count as parameters,
 * and returns a String representing that student's graduation status.
 * The total credit count already includes the honors credits.
 * The graduation status to return is determined by the following rules:
 *
 * ・Students must have completed at least 180 credits with a GPA of at least 2.0 to graduate.
 *   A student who does not meet both of these constraints should receive a return value of "not graduating".
 *
 * ・Students who do have enough credits to graduate and sufficiently high GPAs will receive one of four return values
 *   depending on the GPA and number of honors credits:
 *   - All students with GPAs between 2.0 and 3.6 receive a return value of "graduating".
 *   - Students with fewer than 15 honors credits receive a return of "cum laude"
 *     if their GPA is at least 3.6 but less than 3.8, and a return of "magna cum laude" if their GPA is at least 3.8.
 *   - Students with 15 or more honors credits receive a return of "magna cum laude"
 *     if their GPA is at least 3.6 but less than 3.8, and a return of "summa cum laude" if their GPA is at least 3.8.
 *
 * Here are some example calls to the method and their resulting return values:
 * graduation(3.87, 178, 16)    "not graduating"
 * graduation(2.7, 380, 50)     "graduating"
 * graduation(3.93, 185, 0)     "magna cum laude"
 * graduation(3.85, 190, 15)    "summa cum laude"
 *
 * (You may assume that the GPA will be between 0.0 and 4.0 and that both credit counts will be non-negative integers.)
 */


class GPA {
    public static void main(String[] args) {
        System.out.println(graduation(3.87, 178, 16));
        System.out.println(graduation(1.5, 199, 30));
        System.out.println(graduation(2.7, 380, 50));
        System.out.println(graduation(3.62, 200, 20));
        System.out.println(graduation(3.93, 185, 0));
        System.out.println(graduation(3.85, 190, 15));

    }

    public static String graduation(double gpa, int total_credit, int  honors_credit) {
        if (total_credit < 180 || gpa < 2.0) {
            return "not graduating";
        } else if (gpa >= 2.0 && gpa < 3.6) {
            return "graduating";
        } else if (honors_credit < 15 && gpa >= 3.6 && gpa < 3.8) {
            return "cum laude";
        } else if (honors_credit < 15 && gpa >= 3.8) {
            return "magna cum laude";
        } else if (honors_credit >= 15 && gpa >= 3.6 && gpa < 3.8) {
            return "magna cum laude";
        } else if (honors_credit >= 15 && gpa >= 3.8) {
            return "summa cum laude";
        } else {
            return "";
        }
    }
}

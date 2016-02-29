/*
 *  Write a method named enoughTimeForLunch that accepts four integers hour1, minute1, hour2, and minute2 as parameters.
 *  Each pair of parameters represents a time on the 24-hour clock (for example, 1:36 PM would be represented as 13 and 36).
 *  The method should return true if the gap between the two times is long enough to eat lunch:
 *  that is, if the second time is at least 45 minutes after the first time.
 *  Otherwise the method should return false.
 *
 *  You may assume that all parameter values are valid: the hours are both between 0 and 23,
 *  and the minute parameters are between 0 and 59.
 *  You may also assume that both times represent times in the same day,
 *  e.g. the first time won't represent a time today while the second time represents a time tomorrow.
 *
 *  Note that the second time might be earlier than the first time; in such a case, your method should return false.
 *
 *  Here are some example calls to your method and their expected return results:
 *  enoughTimeForLunch(11, 00, 11, 59)  true
 *  enoughTimeForLunch(12, 30, 13, 00)  false
 *  enoughTimeForLunch(12, 30, 13, 15)  true
 *  enoughTimeForLunch(14, 20, 17, 02)  true
 *  enoughTimeForLunch(12, 30, 9, 30)   false
 *  enoughTimeForLunch(12, 00, 11, 55)  false
 */

class Lunch{
    public static void main(String[] args) {
        System.out.println(enoughTimeForLunch(11, 00, 11, 59));
        System.out.println(enoughTimeForLunch(12, 30, 13, 00));
        System.out.println(enoughTimeForLunch(12, 30, 13, 15));
        System.out.println(enoughTimeForLunch(14, 20, 17, 02));
        System.out.println(enoughTimeForLunch(12, 30, 9, 30));
        System.out.println(enoughTimeForLunch(12, 00, 11, 55));
    }

    public static boolean enoughTimeForLunch(int h1, int m1, int h2, int m2){
        int h1_min = 60 * h1 + m1;
        int h2_min = 60 * h2 + m2;
        if (h2_min - h1_min >= 45){
            return true;
        } else {
            return false;
        }
    }
}

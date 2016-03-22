/*
 * Write a method speedingTicket that decides whether a given driver should be given a speeding ticket from a police officer.
 * The method accepts three parameters:
 * the driver's car speed in miles per hour, as an integer;
 * the current speed limit, as an integer;
 * and whether or not the police officer has eaten a donut today, as a true/false value.
 * (A police officer that has eaten a donut is happy, so he/she is less likely to give the driver a ticket.)
 *
 * Your method should return true if the driver should receive a speeding ticket, and false if not.
 * A driver should be given a speeding ticket if any of the following conditions are met:
 *
 * The officer has eaten a donut (true) and the driver's speed is at least 10 mph over the speeding limit.
 * The officer has not eaten a donut (false) and the driver's speed is at least 5 mph over or under the limit.
 * The driver is going 100 mph or faster, regardless of the speed limit or donut status.
 *
 * You may assume that the integers passed as parameters will be non-negative.
 * Here are some example calls to the method and their resulting return values:
 *
 * Call                             Value Returned
 * speedingTicket(58, 55, false)    false
 * speedingTicket(51, 55, false)    false
 * speedingTicket(42, 35, false)    true
 * speedingTicket(30, 35, false)    true
 * speedingTicket(45, 30, true)     true
 * speedingTicket(49, 40, true)     false
 * speedingTicket(22, 30, true)     false
 * speedingTicket(102, 15, false)   true
 * speedingTicket(100, 98, true)    true
 *
 */

class Ticket {
    public static void main(String[] args) {
        System.out.println(speedingTicket(58, 55, false));
        System.out.println(speedingTicket(51, 55, false));
        System.out.println(speedingTicket(42, 35, false));
        System.out.println(speedingTicket(30, 35, false));
        System.out.println(speedingTicket(45, 30, true));
        System.out.println(speedingTicket(49, 40, true));
        System.out.println(speedingTicket(22, 30, true));
        System.out.println(speedingTicket(102, 15, false));
        System.out.println(speedingTicket(100, 98, true));
    }

    public static boolean speedingTicket(int speed, int limit, boolean donut) {
        if (donut == true && speed - limit >= 10){
            return true;
        } else if (donut == false && Math.abs(speed - limit) >= 5) {
            return true;
        } else if (speed >= 100) {
            return true;
        } else {
            return false;
        }
    }
}

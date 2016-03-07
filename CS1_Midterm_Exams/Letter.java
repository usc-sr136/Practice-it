/*
 * Write a method named 'favoriteLetter' that accepts two parameters:
 * a Scanner for the console, and a favorite letter represented as a one-letter String.
 * The method repeatedly prompts the user until two consecutive words are entered that start with that letter.
 * The method then prints a message showing the last word typed.
 *
 * You may assume that the user will type a single-word response to each prompt.
 * Your code should be case-sensitive;
 * for example, if the favorite letter is a, you should not stop prompting if the user types words that start with an A.
 *
 * Call:
 * Scanner console = new Scanner(System.in);
 * favoriteLetter(console, "A");
 *
 * Output:
 * Looking for two "A" words in a row.
 * Type a word: I
 * Type a word: love
 * Type a word: CSE142!
 * Type a word: AND
 * Type a word: PROGRAMS
 * Type a word: are
 * Type a word: always
 * Type a word: Absolutely
 * Type a word: Awesome
 * "A" is for "Awesome"
 *
 */

import java.util.*;

class Letter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        favoriteLetter(console, "A");
    }

    public static void favoriteLetter(Scanner console, String s){
        System.out.println("Looking for two \"" + s  + "\" words in a row.");
        int counter = 0;
        String input = "";
        while (counter < 2){
            System.out.print("Type a word: ");
            input = console.next();
            if (input.charAt(0) == s.charAt(0)){
                counter++;
            }
            else {
                counter = 0;
            }
        }
        System.out.println("\"" + s + "\" is for \"" + input  +"\"");
    }
}

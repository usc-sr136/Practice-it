/*
 * Write a for loop that produces the following output:
 * 10 bottles of beer on the wall, 10 bottles of beer
 * Take one down, pass it around, 9 bottles of beer on the wall
 *
 * 9 bottles of beer on the wall, 9 bottles of beer
 * Take one down, pass it around, 8 bottles of beer on the wall
 *
 * ... (output continues in the same pattern) ...
 *
 * 1 bottles of beer on the wall, 1 bottles of beer
 * Take one down, pass it around, 0 bottles of beer on the wall
 */
class Beer{
    public static void main(String[] args) {
        bottlesOfBeer();
    }

    public static void bottlesOfBeer() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer");
            System.out.println("Take one down, pass it around, " + (i-1) + " bottles of beer on the wall");
            System.out.println();
        }

    }

}

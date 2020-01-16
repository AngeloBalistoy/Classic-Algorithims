/**
 * Contains functions to help calculate Collatz Conjecture problems
 */
public class CollatzConjectureCalculator {


    /**
     * Constructs a CollatzConjectureCalculator object
     */
    public CollatzConjectureCalculator() {

    }

    /**
     * Calculates the CollatzConjecture for a number
     * @param input The starting number
     * @return The number of steps to get to the number.
     */
    private int calculateNumber(int input) {
        int counter = 0;
        while (input != 0) {
            //Input will half if even or be tripled and then increase by 1 if odd.
            input = input % 2 == 0 ? input/2 : input*3 + 1;
            counter++;
        }
        return counter;
    }


}

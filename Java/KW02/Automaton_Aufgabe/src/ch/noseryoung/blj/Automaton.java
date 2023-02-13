package ch.noseryoung.blj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class implements an elementary cellular automaton. See
 * {@link <a href="https://en.wikipedia.org/wiki/Elementary_cellular_automaton"></a>} for
 * clarification.
 *
 * @author surber
 *
 */
public class Automaton {

    private String rule;
    private String currentGeneration;

    private List<String> history;

    /**
     * This constructor initializes this Automaton with a given rule and an initial
     * generation. Once initialized, the values cannot be changed later.
     *
     * @param rule              The rule to determine the value of a cell in the
     *                          next generation. Expected is a String representing a
     *                          binary value between 00000000 and 11111111.
     * @param initialGeneration The first generation of this Automaton, which also
     *                          makes it the basis for all future generations.
     *                          Expected is a String having only ones and zeros and
     *                          a minimal length of 3.
     *
     * @throws IllegalArgumentException if the given rule doesn't match the pattern
     *                                  <code>[01]{8}</code> or the initial state
     *                                  doesn't match <code>[01]{3,}</code>.
     */
    public Automaton(String rule, String initialGeneration) throws IllegalArgumentException {
        // EXTRA CHALLENGE: Implement this constructor using no more than 6 lines of code
    }

    /**
     * This constructor initializes this Automaton with a given rule and an initial
     * generation. Once initialized, the values cannot be changed later.
     *
     * @param rule              The rule to determine the value of a cell in the
     *                          next generation. Expected is an integer value
     *                          between 0 and 255.
     * @param initialGeneration The first generation of this Automaton, which also
     *                          makes it the basis for all future generations.
     *                          Expected is a String having only ones and zeros and
     *                          a minimal length of 3.
     */
    public Automaton(int rule, String initialGeneration) {
        // EXTRA CHALLENGE: Implement this constructor using no more than 1 line of code
    }

    /**
     * This method advances this Automatons generation by one. This is done by using
     * the given rule and the current generation, with the latter changing
     * every time this method gets called. All generations get saved in
     * {@link #history}.
     *
     * @return a String representing the next generation.
     */
    public String nextGeneration() {
        // EXTRA CHALLENGE: Implement this method using no more than 12 lines of code
    }

    /**
     * This method advances this Automaton by any number of generations. Since with
     * every iteration, {@link #nextGeneration()} gets called, all generations up to
     * the one that was advanced to will get saved in {@link #history}.
     *
     * @param numGenerations The number of generations to advance.
     */
    public void run(int numGenerations) {
        // EXTRA CHALLENGE: Implement this method using no more than 3 lines of code
    }

    /**
     * This method prints all generations that were recorded up until this point
     * chronologically in the console. The output can be formatted using the
     * arguments, which will replace the 0-states and 1-states respectively.
     *
     * @param state0Char The character to replace the 0 state with.
     * @param state1Char The character to replace the 1 state with.
     */
    public void printHistory(char state0Char, char state1Char) {
        // EXTRA CHALLENGE: Implement this method using no more than 2 lines of code
    }

    public String getBinaryRule() {
        return getBinaryRule();
    }

    public int getIntegerRule() {
        return getIntegerRule();
    }

    public String getCurrentGeneration() {
        return getCurrentGeneration();
    }

    public List<String> getHistory() {
        return getHistory();
    }
}
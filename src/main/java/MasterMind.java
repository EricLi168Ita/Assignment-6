/*  SCENARIO
 * The game Mastermind is a code-breaking game for two players, the 
 * code-maker and the code-breaker. The code-maker picks four different 
 * colors in a specific order and the code-breaker has 'x' number of tries 
 * to break the code.
 * You will be creating a class called MasterMind that will be simulating 
 * this game, but with letters.
 */

/*  INSTRUCTIONS
 * The hidden word contains only capital letters and has a length known 
 * to the player. A guess contains only capital letters and has the same 
 * length as the hidden word.
 * After a guess is made, the player is given a hint that is based on a 
 * comparison between the hidden word and the guess. Each position in the 
 * hint contains a character that corresponds to the letter in the same 
 * position in the guess.
 * 
 * RULES
 * If the letter in the guess is...         The corresponding character in the hint is
 * also in the same position in             the matching letter
 * the hidden word
 * also in the hidden word, but             "+"
 * in a different position
 * not in the hidden word                   "*"
 * 
 * The MasterMind class will be used to represent the hidden word in the game. 
 * The hidden word is passed to the constructor. The calss contains a method, 
 * getHint, that takes a guess and produces a hint.
 * 
 * Example of declaration of new MasterMind class:
 * MasterMind puzzle = new MasterMind("LIGHT");
 * 
 * Example of using getHint method:
 * Call to getHint              String returned
 * puzzle.getHint("TTTTT")      "++++T"
 * puzzle.getHint("MOUNT")      "****T"
 * puzzle.getHint("HABIT")      "+**+T"
 * puzzle.getHint("FIGHT")      "*IGHT"
 * puzzle.getHint("LIGHT")      "LIGHT"
 *
 * Write the complete MasterMind class, including any necessary instance variables, 
 * its constructors, and the method, getHint described above. You may assume the 
 * length of the guess is the same as the length of the hidden word.
 */

// COMPLETE THIS CLASS
public class MasterMind {
    /* INSERT ANY VARIABLES BELOW HERE 
     * Global variables should be private
     */




    /* INSERT CONSTRUCTOR BELOW
     * This constructor will have one parameter of the type String.
     * Constructors need to have the same name as it's class, start with a capitalized
     * letter, and be public.
     */




    /* INSERT getHint METHOD BELOW
     * This method will have one parameter of the type String.
     * This method will return a String.
     * This method needs to be public.
     */




    public static void main(String[] args) {
        // Uncomment the following code to test your class

        // MasterMind puzzle = new MasterMind("LIGHT");
        // System.out.print("Expected: ++++T   ");
        // System.out.println("Result: " + puzzle.getHint("TTTTT"));
        // System.out.print("Expected: ****T   ");
        // System.out.println("Result: " + puzzle.getHint("MOUNT"));
        // System.out.print("Expected: +**+T   ");
        // System.out.println("Result: " + puzzle.getHint("HABIT"));
        // System.out.print("Expected: *IGHT   ");
        // System.out.println("Result: " + puzzle.getHint("FIGHT"));
        // System.out.print("Expected: LIGHT   ");
        // System.out.println("Result: " + puzzle.getHint("LIGHT"));
    }
}
public class MasterMind {
    private String hiddenWord;

    public MasterMind(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    public String getHint(String guess) {
        StringBuilder hint = new StringBuilder(" ".repeat(hiddenWord.length()));
        boolean[] usedInHidden = new boolean[hiddenWord.length()];
        boolean[] usedInGuess = new boolean[hiddenWord.length()];

        // First pass: check for correct positions
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (guess.charAt(i) == hiddenWord.charAt(i)) {
                hint.setCharAt(i, guess.charAt(i));
                usedInHidden[i] = true;
                usedInGuess[i] = true;
            }
        }

        // Second pass: check for correct letters in the wrong positions
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (hint.charAt(i) == ' ') {
                int index = hiddenWord.indexOf(guess.charAt(i));
                if (index >= 0 && !usedInHidden[index]) {
                    hint.setCharAt(i, '+');
                    usedInHidden[index] = true;
                } else {
                    hint.setCharAt(i, '*');
                }
            }
        }

        return hint.toString();
    }

    public static void main(String[] args) {
        MasterMind puzzle = new MasterMind("LIGHT");
        System.out.print("Expected: ++++T   ");
        System.out.println("Result: " + puzzle.getHint("TTTTT"));
        System.out.print("Expected: ****T   ");
        System.out.println("Result: " + puzzle.getHint("MOUNT"));
        System.out.print("Expected: +**+T   ");
        System.out.println("Result: " + puzzle.getHint("HABIT"));
        System.out.print("Expected: *IGHT   ");
        System.out.println("Result: " + puzzle.getHint("FIGHT"));
        System.out.print("Expected: LIGHT   ");
        System.out.println("Result: " + puzzle.getHint("LIGHT"));
    }
}

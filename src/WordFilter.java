/**
 * 
 * @author Daikaiser
 */

public class WordFilter {

    static String[] words = {"fuck", "shit"};

    public static String censor(String input) {
        StringBuilder s = new StringBuilder(input);
        for (int i = 0; i < input.length(); i++) {
            for (String word : words) {
                try {
                    if (input.substring(i, word.length()+i).equalsIgnoreCase(word)) {
                        for (int j = i; j < i + word.length(); j++) {
                            s.setCharAt(j, '*');
                        }
                    }
                } catch (Exception e) {
                }
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(censor("You shit are fucking idiot"));
    }
}

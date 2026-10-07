import java.util.ArrayList;

public class Paragraph {
    private ArrayList<String> words = new ArrayList<>();

    public void addLine(String line) {
        String[] splitWords = line.trim().split("\\s+");
        for (String word : splitWords) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }
    }

    public ArrayList<String> getWords() {
        return words;
    }
}

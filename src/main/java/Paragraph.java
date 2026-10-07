import java.util.ArrayList;

public class Paragraph {
    private ArrayList<String> words = new ArrayList<>();

    public void addLine(String line) {
        String[] words = line.trim().split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }
    }
    public ArrayList<String> getWords() {
        return words;
    }
}

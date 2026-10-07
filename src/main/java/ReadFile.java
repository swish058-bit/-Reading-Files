import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    private ArrayList<Paragraph> paragraphs = new ArrayList<>();

    public ReadFile(String fname) throws IOException {
        read(fname);
    }

    public ArrayList<Paragraph> getParagraphs() {
        return paragraphs;
    }

    private void read(String fname) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fname));

        Paragraph current = new Paragraph();
        String line;

        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) {
                if (!current.getWords().isEmpty()) {
                    paragraphs.add(current);
                    current = new Paragraph();
                }
            } else {
                current.addLine(line);
            }
        }
        if (!current.getWords().isEmpty()) {
            paragraphs.add(current);
        }

        br.close();
    }
}

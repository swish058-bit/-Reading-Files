import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class test {

    @Test
    public void testParagraphAddLine() {
        Paragraph p = new Paragraph();
        p.addLine("Hello world this is a test");

        ArrayList<String> words = p.getWords();

        assertEquals(6, words.size());
        assertEquals("Hello", words.get(0));
        assertEquals("test", words.get(5));
    }

    @Test
    public void testReadFileParagraphCount() throws Exception {
        ReadFile rf = new ReadFile("data/GettysburgAddress.txt");
        ArrayList<Paragraph> paras = rf.getParagraphs();

        assertEquals(5, paras.size());
    }

    @Test
    public void testFirstParagraphWords() throws Exception {
        ReadFile rf = new ReadFile("data/GettysburgAddress.txt");
        ArrayList<Paragraph> paras = rf.getParagraphs();

        Paragraph first = paras.get(0);
        ArrayList<String> words = first.getWords();

        assertTrue(words.contains("Fourscore"));
        assertTrue(words.contains("fathers"));
        assertTrue(words.contains("continent,"));
    }
}

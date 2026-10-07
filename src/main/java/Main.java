import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        try {
            ReadFile rf = new ReadFile("data/GettysburgAddress.txt");
            ArrayList<Paragraph> paras = rf.getParagraphs();

            int pnum = 1;
            for (Paragraph p : paras) {
                System.out.println("Paragraph" + pnum + ":");
                System.out.println(p.getWords());
                System.out.println();
                pnum++;
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
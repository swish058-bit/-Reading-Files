import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        try {
            ReadFile fileRes = new ReadFile("data/GettysburgAddress.txt");
            ArrayList<String> lines = fileRes.getLines();
            int linenum = 1;
            for (String line: lines) {
                System.out.println(linenum + ": " + line);
                linenum++;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}
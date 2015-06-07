import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Lab02Task1
{
    /**
     * Saves all the game records in the GameRecord array to a text file.
     * Each game record should be written in a new line in the text file.
     * The name, level and score should be separated by a tab character('\t') in each line.
     * 
     * @param records   The GameRecord array containing all the game records.
     * @param writer    The java.io.Writer object which points to the file to be written.
     */
    public void saveGameRecords(GameRecord[] records, java.io.Writer writer) {
       // write your code after this line
       PrintWriter pw = new PrintWriter(writer);
       for (int i = 0; i < records.length; i++) {
           pw.println(records[i].getName() + "\t" + records[i].getLevel() + "\t" + records[i].getScore());
       }
       pw.close();
       
    }
    
    public static void testCase1() throws IOException {

        int numOfRecords = 10;
        GameRecord[] records = new GameRecord[numOfRecords];
        for (int i = 0; i < numOfRecords; i++) {
            records[i] = new GameRecord("" + (char)(i + 65), 2, 10);
        }
        
        FileWriter writer = new FileWriter("actual.txt");
        
        Lab02Task1 lab02Task1 = new Lab02Task1();
        lab02Task1.saveGameRecords(records, writer);
        System.out.println("actual.txt has been generated");
    }
}

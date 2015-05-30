
public class Lab01Task1
{
    public int minPos(GameRecord[] records, int size) {
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (records[i].getLevel() < records[j].getLevel()) {
                j = i;
            } else if (records[i].getLevel() == records[j].getLevel()) {
                if (records[i].getScore() <= records[j].getScore()) {
                    j = i;
                }
            }
        } 
        return j; // this line should be removed or modified after the implementation of this method is completed.
    }
    
    public static void testCase1() {
    
        GameRecord[] records = new GameRecord[4];
        records[0] = new GameRecord("A", 0, 20);
        records[1] = new GameRecord("B", 0, 20);
        records[2] = new GameRecord("C", 0, 37);
        records[3] = new GameRecord("D", 1, 2);
        
        Lab01Task1 lab01Task1 = new Lab01Task1();
        int actualOutput = lab01Task1.minPos(records, 3); // only searching the first 3 elements
        
        System.out.println("Expected output: 2");
        System.out.println("Actual output: " + actualOutput);
    }
    
    // You can add more test cases to test your program prior to submitting your code to the online grader.
}

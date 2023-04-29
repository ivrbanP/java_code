import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class CSVMatcher {

    public static void main(String[] args) {
        String file1 = "file1_big.csv";
        String file2 = "file2_big.csv";
        HashMap<Integer, Integer> id1Map = readID1Column(file1);
        int matchCount = countMatches(file2, id1Map);
        System.out.println("Number of matches: " + matchCount);
    }

    public static HashMap<Integer, Integer> readID1Column(String fileName) {
        HashMap<Integer, Integer> id1Map = new HashMap<>();
        int i = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                //int id1 = Integer.parseInt(values[0]);
                i++;
                
                // System.out.println("i: " + i);
                // System.out.println("value: " + values[0]);
                int value = Integer.parseInt(values[0]);
                id1Map.put(i, value);
            }
        } catch (Exception e) {
            System.out.println("hashMap method");
            e.printStackTrace();
        }
        return id1Map;
    }

    public static int countMatches(String fileName, HashMap<Integer, Integer> id1Map) {
        int matchCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                // System.out.println("value2: " + values[0]);
                int id2 = Integer.parseInt(values[0]);
                if (id1Map.containsKey(id2)) {
                    matchCount++;
                }
            }
        } catch (Exception e) {
            System.out.println("countMatches method");
            e.printStackTrace();
        }
        return matchCount;
    }
}

package bogani_problem1;
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemover {

    private String uniqueWords = "";

    void remove(String dataFile) throws IOException {
        Set<String> allwords = new HashSet<>();
      //bfrdr: "before reading"
        BufferedReader bfrdr = new BufferedReader(new FileReader(dataFile));
        String line;
        while (null != (line = bfrdr.readLine())) {
            allwords.addAll(Arrays.asList(line.split(" ")));
        }
        bfrdr.close();
        for (String uniwords : allwords)
            uniqueWords = uniqueWords.concat(uniwords).concat("\n");
    }
    void write(String outputFile) throws IOException {
        new File(outputFile).createNewFile();
        FileWriter myWriter = new FileWriter(outputFile);
        myWriter.write(uniqueWords);
        myWriter.close();
    }
}
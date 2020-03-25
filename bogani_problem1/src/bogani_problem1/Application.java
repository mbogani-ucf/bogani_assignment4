package bogani_problem1;
import java.io.IOException;
public class Application {

    public static void main(String[] args) {

        DuplicateRemover duplicateRemover = new DuplicateRemover();
        try {
            duplicateRemover.remove("problem1.txt");
            duplicateRemover.write("unique_words.txt");
            System.out.println("Scanning Completed.");
        } catch (IOException e) {
            System.out.println("Exception occurred: " + e.toString());
            e.printStackTrace();
        }

    }
}
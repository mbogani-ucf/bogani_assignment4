package bogani_problem2;

public class Application{
	   public static void main(String[] args){
	       String inFilename = "problem2.txt";
	       String outFilename = "unique_word_counts.txt";
	      
	       DuplicateCounter dplctr = new DuplicateCounter();
	       dplctr.count(inFilename);
	       dplctr.write(outFilename);
	       System.out.println("scanning complete" + outFilename);
	   }
	}
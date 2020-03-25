package bogani_problem2;
import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter{
   private HashMap<String, Integer> wordCounter;
   public DuplicateCounter(){
       wordCounter = new HashMap<String, Integer>();
   }

   public void count(String dataFile){
       wordCounter.clear();
       try{
    	   //bfrdr: "before reading"
           Scanner bfrdr = new Scanner(new File(dataFile));
           String allwords;
           while(bfrdr.hasNext()){
               allwords = bfrdr.next();
               allwords = cleanUp(allwords);
               if(!allwords.equals("")) {
                   if(wordCounter.get(allwords) == null)
                       wordCounter.put(allwords, 1);
                   else
                       wordCounter.put(allwords, wordCounter.get(allwords) + 1);
               }
           }
           bfrdr.close();
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
   }


   public void write(String outputFile){
       try{
           PrintWriter out = new PrintWriter(new File(outputFile));
           for(String uniwords : wordCounter.keySet()){
               out.println(uniwords + ": " + wordCounter.get(uniwords));
           }
           out.close();
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
   }

   private String cleanUp(String word){
       String str = "";
       for(int i = 0; i < word.length(); i++){
           char c = word.charAt(i);
           if(Character.isAlphabetic(c))
               str = str + c;
       }
       return str.toLowerCase().trim();
   }
}


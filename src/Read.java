import java.io.*;
public class Read {
   static String readin(String name) throws IOException {
       String text = "";
       try {
           BufferedReader br = new BufferedReader(new FileReader("src/" +name));
           while (br.ready()) { // while loop begins here
               text = text + br.readLine();

           }

       } catch (IOException e) {
           System.out.println("Error");//f
       }
       return text;
   }


}

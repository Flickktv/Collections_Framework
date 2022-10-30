import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileWordSearch {

    public static void main(String[] args) throws IOException {

        File f1 = new File("src/Урок 6. Collections Framework (скачан).txt"); //Creation of File Descriptor for input file
        String[] words = null;  //Intialize the word Array
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        String input = "страдани";   // Input word to be searched
        int count = 0;   //Intialize the word to zero
        while((s = br.readLine()) != null) {  //Reading Content from the file
            words = s.split(" ");  //Split the word using space
            for (String word : words) {
                if (word.toLowerCase().startsWith(input))   //Search for the given word
                {
                    count++;    //If Present increase the count by one
                }
            }
        }
        System.out.println("Слово *страдание* в первом томе книги Льва Толстого 'Война и мир' встретилось " + count + " раз");

        fr.close();
    }


}
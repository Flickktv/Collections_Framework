import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File f1 = new File("src/Урок 6. Collections Framework (скачан).txt");
        Scanner scanner = new Scanner(f1);
        String input = "страдани";
        int count = 0;
        while(scanner.hasNext()){
            if (scanner.next().toLowerCase().startsWith(input)) {
                count++;
            }
        }
        scanner.close();
        System.out.println("Слово *страдание* в первом томе книги Льва Толстого 'Война и мир' встретилось " + count + " раз");
    }
}
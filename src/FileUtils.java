import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FileUtils {
    public static void parsFile(String path) throws IOException {
        Path fileExceptionDictionary = Path.of(path);
        List<String> list = Files.readAllLines(fileExceptionDictionary);
        Scanner scanner =new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            for (String word : list) {
                if (text.toLowerCase(Locale.ROOT).indexOf(word) !=-1) {
                    try {
                        throw new BedWordExeption("Вы использовали плохое слово!!!");
                    } catch (BedWordExeption bedWordExeption) {
                        bedWordExeption.printStackTrace();

                    }
                }
            }
        }




    }
}

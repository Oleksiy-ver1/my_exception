import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        String path = "ExceptionDictionary.txt";

        try {
            FileUtils.parsFile(path);
        } catch (IOException e) {
            System.out.println("Файл с образцами не найден");;
        }


    }
}

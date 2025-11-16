import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Укажите путь к файлу: ");
            String path = scanner.nextLine();
            //if (path.equals("exit")) break;
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists && !isDirectory) {
                System.out.println("Файл по указанному пути не существует");
                continue;
            }

            if (fileExists && !isDirectory) {
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + ++count);
                continue;
            }

            if (isDirectory) {
                System.out.println("Указанный путь является путём к папке, а не к файлу");
            }
        }
    }
}

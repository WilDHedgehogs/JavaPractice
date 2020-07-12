import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Задача №16: Выгрузка данных из файла на экран
public class FileInput {

    public static void main(String[] args) throws IOException {

        String fileName = "./resources/potter.txt";

        String line;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {

            while ((line = fileReader.readLine()) != null) {

                System.out.println(line);

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задача №16: Выгрузка данных из файла на экран
public class FileInput {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter file path and name: ");
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

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

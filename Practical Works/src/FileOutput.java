import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//Задача №17: Запись данных в файл.
public class FileOutput {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "./src/tempFile.txt";

        String line;
        System.out.println("Enter 'stop' to end");
        try (FileWriter fileWriter = new FileWriter(fileName)) {

            while (true) {

                System.out.print(": ");
                line = bufferedReader.readLine();

                if (line.equals("stop")) {

                    break;

                }

                line += "\r\n";
                fileWriter.write(line);

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}

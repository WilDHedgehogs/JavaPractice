import java.io.*;

//Задача №18: Выгрузка данных из файла, проверка и перезапись
public class FileInputAndOutput {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter file path and name: ");
        String fileName = bufferedReader.readLine();
        int lineCount = 0;

        //Вывод из файла.
        String line;
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {

            while ((line = fileReader.readLine()) != null) {

                lineCount++;
                System.out.println(line);

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

        //Запись в файл.
        System.out.println("\nNow enter new data to file: ");
        try (FileWriter fileWriter = new FileWriter(fileName)) {

            for (int i = 0; i < lineCount; i++) {

                System.out.print(": ");
                line = bufferedReader.readLine();

                if (!(i + 1 == lineCount)) {

                    line += "\r\n";

                }

                fileWriter.write(line);

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}

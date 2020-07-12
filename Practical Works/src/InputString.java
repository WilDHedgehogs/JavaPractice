import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задача №11: Ввод строки с клавиатуры
public class InputString {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter string: ");
        String text = bufferedReader.readLine();
        bufferedReader.close();

        System.out.println("You entered: " + text);

    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задача №13: Сравнение двух строк
public class StringComparer {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first string: ");
        String firstString = bufferedReader.readLine();
        System.out.print("Enter second string: ");
        String secondString = bufferedReader.readLine();
        bufferedReader.close();

        if (firstString.length() > secondString.length()) {
            System.out.println(firstString);
        } else if (secondString.length() > firstString.length()) {
            System.out.println(secondString);
        } else  {
            System.out.println("Strings lenghts are equal");
        }

    }

}

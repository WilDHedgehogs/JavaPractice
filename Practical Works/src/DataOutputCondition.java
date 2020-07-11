import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Условие вывода данных
public class DataOutputCondition {

    public static void main(String[] args) throws IOException {

        //Константы
        final int x = 1;
        final int y = 7;
        final int z = 91;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number: ");

        int number = Integer.parseInt(bufferedReader.readLine());

        switch (number) {

            case x:
            case y:
            case z:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
                break;

        }

    }

}

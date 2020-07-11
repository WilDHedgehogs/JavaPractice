import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задача №6: Отработка арифметических операций.
public class ArithmeticOperations {

    //Арифметические операции.
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first number: ");
        int x = Integer.parseInt(bufferedReader.readLine());

        System.out.print("Enter second number: ");
        int y = Integer.parseInt(bufferedReader.readLine());

        System.out.print("Enter third number: ");
        int z = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        double average = (x * 1.0 + y + z) / 3;
        System.out.printf("Average of x:" + x + ", y:" + y + ", z:" + z + " = %.2f\n", average);

        int result = (int) (average / 2);
        if (result > 3) {

            System.out.println("Программа выполнена корректно");

        }

    }

}

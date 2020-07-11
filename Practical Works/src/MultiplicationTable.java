import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Таблица умножения
public class MultiplicationTable {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number;

        System.out.print("Enter number: ");
        number = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        System.out.println("Simple result:");
        MultiplyNumber(number);

        System.out.println("\nRecurcive result:");
        String recurciveResult = RecurciveMultiplyNumber(number, 1);
        System.out.println(recurciveResult);

    }

    //Вариант с ручным набором.
    public static void MultiplyNumber(int targetNumber) {

        System.out.println(targetNumber + " * 1 = " + targetNumber); //Компилятор предложил упростить targetNumber * 1.
        System.out.println(targetNumber + " * 2 = " + targetNumber * 2);
        System.out.println(targetNumber + " * 3 = " + targetNumber * 3);
        System.out.println(targetNumber + " * 4 = " + targetNumber * 4);
        System.out.println(targetNumber + " * 5 = " + targetNumber * 5);
        System.out.println(targetNumber + " * 6 = " + targetNumber * 6);
        System.out.println(targetNumber + " * 7 = " + targetNumber * 7);
        System.out.println(targetNumber + " * 8 = " + targetNumber * 8);
        System.out.println(targetNumber + " * 9 = " + targetNumber * 9);
        System.out.println(targetNumber + " * 10 = " + targetNumber * 10);

    }

    //Вариант с рекурсией.
    public static String RecurciveMultiplyNumber(int targetNumber, int startNumber) {

        String result = "";

        if (startNumber > 10) {
            return result;
        }

        result = targetNumber + " * " + startNumber + " = " + targetNumber * startNumber + "\n" + RecurciveMultiplyNumber(targetNumber, startNumber + 1);

        return result;

    }

}

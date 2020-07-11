
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задача №4: Отработка поразрядных операций.
public class BinaryToDecimalTransformer {

    //Перевод из двоичной в десятичную систему счислений.
    public static void main(String[] args) throws IOException {

        System.out.print("Enter number binary number: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //String для обработки большего количество вводимых двоичных чисел.
        String stringBinaryNumber = bufferedReader.readLine();
        bufferedReader.close();

        int decimalNumber = BinaryToDecimal(stringBinaryNumber);

        if (decimalNumber == - 1) {
            System.out.println("Incorrect input data!");
            return;
        }

        System.out.println("Binary [" + stringBinaryNumber + "]" +
                " = [" + decimalNumber + "] Decimal");

    }

    //Функция для перевода из двоичной в десятичную.
    public static int BinaryToDecimal(String stringBinaryNumber) {

        int power = 0;
        int decimalNumber = 0;


        for (int i = stringBinaryNumber.length(); i > 0; i--) {
            try {

                int tempNumber = Integer.parseInt(stringBinaryNumber.substring(i - 1, i));

                if (tempNumber < 0 || tempNumber > 1) {
                    return -1;
                }
                decimalNumber += Math.pow(2, power++) * tempNumber;

            } catch (NumberFormatException e) {

                return -1;

            }
        }

        return decimalNumber;

    }

}

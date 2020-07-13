import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Итоговая задача №1
public class BinaryToDecimal {

    public static void main(String[] args) throws IOException {

        System.out.print("Enter binary number: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int binaryNumber = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        int decimalNumber = 0;
        int power = 0;

        System.out.print("Binary [" + binaryNumber + "] = ");

        while (binaryNumber != 0) {

            int lastDigit = binaryNumber % 10;
            decimalNumber += Math.pow(2, power++) * lastDigit;

            binaryNumber /= 10;

        }

        System.out.println("[" + decimalNumber + "] Decimal");

    }

}

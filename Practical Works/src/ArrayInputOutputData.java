import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задание №9: Ввод/вывод данных для массива.
public class ArrayInputOutputData {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter array length: ");
        int arrayLength = Integer.parseInt(bufferedReader.readLine());

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {

            System.out.print("Enter number: ");
            array[i] = Integer.parseInt(bufferedReader.readLine());

        }

        System.out.println("\nResult array:");
        for (int i = 0; i < arrayLength; i++) {

            if (i % 5 == 0 && i != 0) {

                System.out.println();

            }

            System.out.print(array[i] * 2 + " ");

        }

    }

}

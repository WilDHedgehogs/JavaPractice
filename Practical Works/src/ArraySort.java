import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задача №15: Сортировка данных в массиве
public class ArraySort {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter array length: ");
        int arrayLength = Integer.parseInt(bufferedReader.readLine());

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {

            System.out.print("Enter number: ");
            array[i] = Integer.parseInt(bufferedReader.readLine());

        }
        bufferedReader.close();

        //Сортировка.
        for (int i = array.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

        }

        //Вывод на консоль.
        System.out.println("\nSorted array:");
        for (int i = 0; i < arrayLength; i++) {

            System.out.print(array[i] + " ");

        }

        System.out.println();

    }

}

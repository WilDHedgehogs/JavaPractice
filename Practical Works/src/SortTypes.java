import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Итоговая задача №2.
public class SortTypes {

    public static void main(String[] args) throws IOException {

        //Заполнение массива.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter array length: ");
        int arrayLength = Integer.parseInt(bufferedReader.readLine());

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {

            System.out.print(": ");
            array[i] = Integer.parseInt(bufferedReader.readLine());

        }
        bufferedReader.close();

        //Для наглядности.
//        int[] array = new int[10000];
//        Random random = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//
//            array[i] = random.nextInt(1000);
//
//        }

        SelectionSort(array);
        InsertionSort(array);
        ShellSort(array);

        //QuickSort
        int[] sortedArray = Arrays.copyOf(array, array.length);
        long startTime = System.currentTimeMillis();

        System.out.println("\nQuick Sort:");
        System.out.print("Unsorted array: ");
        System.out.println(Arrays.toString(array));

        int low = 0;
        int high = sortedArray.length - 1;
        QuickSort(sortedArray, low, high);

        long endTime = System.currentTimeMillis();
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Time spent: " + (endTime - startTime) + " ms");

    }

    //Сортировка выбором.
    public static void SelectionSort(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        long startTime = System.currentTimeMillis();

        System.out.println("\nSelection Sort:");
        System.out.print("Unsorted array: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < sortedArray.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < sortedArray.length; j++) {

                if (sortedArray[j] < sortedArray[min]) {

                    min = j;

                }

            }

            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[min];
            sortedArray[min] = temp;

        }

        long endTime = System.currentTimeMillis();
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Time spent: " + (endTime - startTime) + " ms");
    }

    //Сортировка вставками.
    public static void InsertionSort(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        long startTime = System.currentTimeMillis();

        System.out.println("\nInsertion Sort:");
        System.out.print("Unsorted array: ");
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < sortedArray.length; i++ ) {

            int temp = sortedArray[i];

            int j = i - 1;
            while (j >= 0 && sortedArray[j] > temp) {

                sortedArray[j + 1] = sortedArray[j];
                j--;

            }

            sortedArray[j + 1] = temp;

        }

        long endTime = System.currentTimeMillis();
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Time spent: " + (endTime - startTime) + " ms");

    }

    //Быстрая сортировка.
    public static void QuickSort(int[] array,int low, int high) {

        if (array.length == 0) {

            return;

        }

        if (low >= high) {

            return;

        }

        int middle = array[low + (high - low) / 2];
        int i = low;
        int j = high;

        while (i <= j) {

            while (array[i] < middle) {

                i++;

            }

            while (array[j] > middle) {

                j--;

            }

            if (i <= j) {

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;

            }

        }

        if (low < j) {

            QuickSort(array, low, j);

        }

        if (high > i ) {

            QuickSort(array, i, high);

        }

    }

    //Сортировка Шелла.
    public static void ShellSort(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        long startTime = System.currentTimeMillis();

        System.out.println("\nShell Sort:");
        System.out.print("Unsorted array: ");
        System.out.println(Arrays.toString(array));

        int step = sortedArray.length / 2;

        while (step > 0) {

            for (int i = step; i < sortedArray.length; i++) {

                for (int j = i - step; j >= 0 ; j -= step) {

                    if (sortedArray[j] > sortedArray[j + step]) {

                        int temp = sortedArray[j + step];
                        sortedArray[j + step] = sortedArray[j];
                        sortedArray[j] = temp;

                    }

                }

            }

            step /= 2;

        }

        long endTime = System.currentTimeMillis();
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Time spent: " + (endTime - startTime) + " ms");

    }

}

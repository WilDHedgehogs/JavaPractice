import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задание №10: Ввод/вывод данных для матрицы
public class MatrixInputOutputData {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter rows count: ");
        int rows = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Enter columns count: ");
        int columns = Integer.parseInt(bufferedReader.readLine());

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.print("Enter number: ");
                matrix[i][j] = Integer.parseInt(bufferedReader.readLine());

            }

        }
        bufferedReader.close();

        System.out.println("\nFirst row:");
        for (int i = 0; i < columns; i++) {

            System.out.print(matrix[0][i] * 3 + " ");

        }

    }

}

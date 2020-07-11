
//Цикличный вывод данных
public class CyclicalDataOutput {

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            System.out.print(i + " ");

            if (i % 10 == 0) {

                System.out.println();

            }

        }

    }

}


//Задача №8: Цикличный вывод данных на экран.
public class CyclicalDataOutput {

    //Цикличный вывод данных.
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            System.out.print(i + " ");

            if (i % 10 == 0) {

                System.out.println();

            }

        }

    }

}

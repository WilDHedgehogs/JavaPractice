import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Итоговая задача №3
public class CurrencyConverter {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter current dollar rate: ");
        double rate = Double.parseDouble(bufferedReader.readLine().replaceAll(",", "."));
        System.out.print("Enter amount of rubles: ");
        int rubles = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        double dollars = rubles / rate;

        System.out.printf("%d Rubles = %.2f Dollars", rubles, dollars);

    }

}

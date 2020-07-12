import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Задача №14: Преобразование типов
public class TypeConversion {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number: ");
        String S = bufferedReader.readLine();
        int X = Integer.parseInt(S);
        double Y = X;

        System.out.println("String S = " + S + "\nint X = " + X + "\ndouble Y = " + Y);

    }

}

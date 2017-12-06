import java.lang.reflect.Array;
import java.util.Arrays;

public class Tablica {

    public static void main(String[] args) {

        String[] table = new String[3];

        table[0] = "Krzysztof";
        table[1] = "Piotr";
        table[2] = "Joanna";

        for (String x : table)
        System.out.println(x);

    }

}

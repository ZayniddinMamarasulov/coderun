import java.io.*;
import java.util.Arrays;

public class Большесвоихсоседей {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = reader.readLine().split(" ");

        int count = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (Integer.parseInt(a[i]) > Integer.parseInt(a[i - 1]) && Integer.parseInt(a[i]) > Integer.parseInt(a[i + 1]))
                count++;
        }

        System.out.println(count);
    }
}

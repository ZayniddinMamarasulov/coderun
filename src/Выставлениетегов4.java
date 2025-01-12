import java.io.*;

public class Выставлениетегов4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

//        int n = 32;

//        writer.write(calc(n));

        int sum = 0;
        for (int i = 0; i <= n; i++) sum += calc(i);

        System.out.println(sum);

        reader.close();
        writer.close();
    }

    public static int calc(int k) {
        if (k == 0) return 0;
        if (k == 1 || k == 2) return 1;
        return calc(k - 1) + calc(k - 2);
    }
}

import java.io.*;

public class ZadachaAnilitiki29 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = reader.readLine().split(" ");

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);


        double inside = b * b - 4 * a * c;
        if (inside < 0) {
            writer.write("0");
            reader.close();
            writer.close();
            return;
        }

        double sqrt = Math.sqrt(inside);
        double res1 = (-b + sqrt) / (2 * a);
        double res2 = (-b - sqrt) / (2 * a);


        if (res1 == res2) {
            writer.write("1");
            writer.newLine();
            writer.write(String.format("%.6f", res1));
        } else {
            writer.write("2");
            writer.newLine();
            if (res1 > res2) {
                writer.write(String.format("%.6f", res2));
                writer.write(String.format(" %.6f", res1));
            } else {
                writer.write(String.format("%.6f", res1));
                writer.write(String.format(" %.6f", res2));
            }
        }

        reader.close();
        writer.close();
    }

}

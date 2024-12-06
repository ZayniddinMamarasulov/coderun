import java.io.*;

public class Треугольник {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int input1 = Integer.parseInt(reader.readLine());
        int input2 = Integer.parseInt(reader.readLine());
        int input3 = Integer.parseInt(reader.readLine());

        if (input1 + input2 > input3 && input2 + input3 > input1 && input1 + input3 > input2)
            System.out.println("YES");
        else
            System.out.println("NO");

        reader.close();
        writer.close();
    }
}

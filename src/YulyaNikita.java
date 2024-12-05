import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class YulyaNikita {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = reader.readLine().split(" ");

        String x = a[0];
        String y = a[1];

        StringBuffer zeros = new StringBuffer();

        int differ = Math.abs(x.length() - y.length());
        int i = 0;
        while (i < differ) {
            zeros.append('0');
            i++;
        }

        if (x.length() > y.length())
            y = zeros + y;
        else
            x = zeros + x;

        int index = x.length() - 1;
        StringBuffer sum = new StringBuffer();
        int carry = 0;

        while (index >= 0) {
            int total = Character.getNumericValue(x.charAt(index))
                    + Character.getNumericValue(y.charAt(index)) + carry;
            int current = total % 10;
            carry = total / 10;

            sum.append(current);
            index--;
        }

        if (carry != 0)
            sum.append(carry);

        System.out.println(sum.reverse());

        reader.close();
        writer.close();
    }

}

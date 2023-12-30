import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeriesQuery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine()); // Number of queries

        for (int i = 0; i < q; i++) {
            String[] query = br.readLine().split(" ");
            int a = Integer.parseInt(query[0]);
            int b = Integer.parseInt(query[1]);
            int n = Integer.parseInt(query[2]);

            StringBuilder series = new StringBuilder();

            int term = a;
            for (int j = 0; j < n; j++) {
                term += Math.pow(2, j) * b;
                series.append(term).append(" ");
            }

            System.out.println(series.toString().trim());
        }
    }
}

package acm.t1001;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by nifeng on 2018/3/14.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = stdin.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            double a = Double.parseDouble(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(Math.pow(a, b));
        }
    }


}

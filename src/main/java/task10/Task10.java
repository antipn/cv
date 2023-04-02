package task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        String input = Integer.toString(n, 2);

        String[] arr = input.split("0");

        int max = 0;
        for (String s : arr) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        System.out.println(max);


    }
}

package task08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Input name");
            String name = in.next();
            System.out.println("Input phone");
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);

        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here

            if (phoneBook.get(s) != null) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}


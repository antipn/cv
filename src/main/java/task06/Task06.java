package task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int count = Integer.parseInt(bufferedReader.readLine());
        List<String> output = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String input = bufferedReader.readLine();
            output.add(checkString(input));
        }
        bufferedReader.close();
        output.forEach(System.out::println);

    }

    static String checkString (String input){

        String oddString = "";
        String evenString = "";

        if(input.length() < 2){
            return null;
        }

        for (int i = 0 ; i <= input.length()-1 ; i++){
            if (i%2==0){
                oddString = oddString + input.charAt(i);
            } else {
                evenString = evenString + input.charAt(i);
            }

        }

        return (oddString + " " + evenString);
    }
}

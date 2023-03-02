package task01;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {

        Integer myArray[] = {-3, -3, 0, 3, 0, 2, 3};
        System.out.println("Task01, pairs in arrays = " + findPair(myArray));

    }

    public static int findPair(Integer[] array) {
        //идем по масиву с первого элемента и ищем второй элемент который в сумме даст 0
        //когда пара найдена отмечаем индексы что не посчитать их вновь
        int pairs = 0;
        List<Integer> list = new ArrayList<>();
        // or use Collection //Collections.addAll(list, array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
//                System.out.println("проверяем " + array[i] + " [" + i + "] c " + array[j] + " [" + j + "]");
//                System.out.println(list.contains(j));
                if (array[i] + array[j] == 0 && !(list.contains(j)) && !(list.contains(i))) {
                    pairs++;
                    System.out.println("пара найдена " + array[i] + " [" + i + "] c " + array[j] + " [" + j + "]");
                    System.out.println("исключить индекс из поиска " + j + " and " + i);
                    list.add(j);
                    list.add(i);

                }
            }


        }
        return pairs;
    }

}

package task03;

import java.util.Stack;

public class Task03 {
    public static void main(String[] args) {
        String inputRowGood = "({}[])";
        String inputRowBad = "([{)}]";

        checkingRow(inputRowGood);
        checkingRow(inputRowBad);


    }

    public static void checkingRow(String inputRow) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < inputRow.length(); i++) {

            System.out.println("Мы находимся на позиции = " + i);
            //если стэк пуст и мы не дошли до конца строки то запоминаем элемент в нем
            if (stack.empty()) {
                System.out.println("Добавили первую скобку в стэк " + String.valueOf(inputRow.charAt(i)));
                stack.add(String.valueOf(inputRow.charAt(i)));
                i++;
                System.out.println("-> переход на следующую позицию = " + i);
            }

            //мы теперь на след элементе и должны проверить что он может быть закрывающим элементом для того что в стэке

            // -> )
            if (String.valueOf(inputRow.charAt(i)).equals(")")) {
                System.out.println("Нашли закрываюущую скобку ) ");
                if(stack.peek().equals("(")){
                System.out.println("убрали из стека верхний элемент " + stack.peek());
                stack.pop();
                }

                //i++;
            } else if (String.valueOf(inputRow.charAt(i)).equals("(")) {
                System.out.println("Нашли открывющуюся скобку ( ");
                stack.push(String.valueOf(inputRow.charAt(i)));
            }
            // -> ]
            if (String.valueOf(inputRow.charAt(i)).equals("]")) {
                System.out.println("Нашли закрываюущую скобку ] ");
                if(stack.peek().equals("[")) {
                    //System.out.println("убрали из стека верхний элемент " + stack.peek());
                    stack.pop();
                }
                //i++;
            } else if (String.valueOf(inputRow.charAt(i)).equals("[")) {
                System.out.println("Нашли открывющуюся скобку [ ");
                stack.push(String.valueOf(inputRow.charAt(i)));
            }
            // -> }
            if (String.valueOf(inputRow.charAt(i)).equals("}")) {
                System.out.println("Нашли закрываюущую скобку } ");
                if(stack.peek().equals("{")) {
                    System.out.println("убрали из стека верхний элемент " + stack.peek());
                    stack.pop();
                }
                //i++;
            } else if (String.valueOf(inputRow.charAt(i)).equals("{")) {
                System.out.println("Нашли открывющуюся скобку { ");
                stack.push(String.valueOf(inputRow.charAt(i)));
            }


        }

        if (stack.empty()) {
            System.out.println("@Позиция скобок не нарушена");
        } else {
            System.out.println("@Позиция скобок нарушена");
        }
    }
}

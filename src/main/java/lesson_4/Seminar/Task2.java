package lesson_4.Seminar;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Реализовать консольное приложение, которое:
        Принимает от пользователя строку вида
        text~num
        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */
        LinkedList<String> linkList = new LinkedList<>();
        for (;;) {
            String[] str = new Scanner(System.in).nextLine().split("~");
            int index = Integer.parseInt(str[1]);
            if (index > linkList.size()) {
                System.out.println("Error out of bound");
                System.out.println("Repeat your value");
            } else {
                if (str[0].equalsIgnoreCase("print")) {
                    System.out.println(linkList.get(index));
                    linkList.remove(index);
                } else {
                    linkList.add(index, str[0]);
                    System.out.println("Value add");
                }
            }
        }
    }
}

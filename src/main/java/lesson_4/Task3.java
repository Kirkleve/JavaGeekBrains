package lesson_4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Реализовать консольное приложение, которое:
        Принимает от пользователя и “запоминает” строки.
        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        Если введено revert, удаляет предыдущую введенную строку из памяти.
         */
        LinkedList<String> linkStr = new LinkedList<>();
        while (true) {
            String str = new Scanner(System.in).nextLine();
            System.out.println("Введите строку\n");
            if (str.equalsIgnoreCase("print")) {
                Iterator<String> itr = linkStr.iterator();
                while (itr.hasNext()) System.out.println(itr.next());
            } else if (str.equalsIgnoreCase("revert")){
                linkStr.pop();
            } else linkStr.push(str);
        }
    }
}



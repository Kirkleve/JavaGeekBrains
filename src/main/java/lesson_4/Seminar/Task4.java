package lesson_4.Seminar;

import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {
        /*
        1) Написать метод, который принимает массив элементов,
        помещает их в стэк и выводит на консоль содержимое стэка.
        2) Написать метод, который принимает массив элементов,
        помещает их в очередь и выводит на консоль содержимое очереди.
         */
        Object[] obj = {1221, "14rdewsesr", 324, "r32rf", 1, 51224, "tgrtbb02"};
        addToStack(obj);
        addToQueue(obj);
    }
    public static void addToStack(Object[] obj) {
        LinkedList<Object> stack = new LinkedList<>();
        for (Object object : obj) {
            stack.push(object);
        }
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }

    public static void addToQueue(Object[] obj) {
        LinkedList<Object> queue = new LinkedList<>();
        for (Object object : obj) {
            queue.offer(object);
        }
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}

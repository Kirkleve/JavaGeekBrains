package lesson_4.homeWork;

import java.util.Scanner;

public class Stack<T> {
    private T[] array;
    private int index = 0;

    public Stack(int length) {
        this.index = 0;
        this.array = (T[])new Object[length];
    }

    public int size() {
        return this.index;
    }

    public boolean empty() {
        return this.size() == 0;
    }

    public void push(T value) {
        this.array[index++] = value;
    }

    public T peek() {
        return this.array[index - 1];
    }

    public T pop() {
        return this.array[--index];
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(100);
        String input = new Scanner(System.in).nextLine();
        System.out.println(stack.size());
        for (;;) {
            if (input.equalsIgnoreCase("pop")) {
                if (stack.empty()) {
                    System.out.println("Sorry this list have not number");
                } else {
                    stack.pop();
                }
            } else if (input.equalsIgnoreCase("push")) {
                if (stack.size() > stack.index) {
                    System.out.println("Sorry stack over flow");
                } else {
                    stack.push(input);
                }
            } else if (input.equalsIgnoreCase("peek")) {
                stack.peek();
                System.out.println(stack.peek());
            }

        }
    }
}


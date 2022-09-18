package lesson_4.homeWork;

import java.util.Objects;

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

    public boolean push(T value) {
        if(index < array.length) {
            this.array[index++] = value;
            return true;
        } else return false;
    }

    public T peek() {
        if(index > 0) {
            return this.array[index - 1];
        } else return null;
    }

    public T pop() {
        if (index > 0) return this.array[--index];
        else return null;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(100);
        int value = 1;
        while (stack.push("Value " + (value++)));
        System.out.println(stack);
        if(stack.push("Value"+(value++)))
            System.out.println("Элемент " + stack.peek() + " добавлен в стек\n");
        else
            System.out.println("Стек переполнен");
        System.out.println(Objects.requireNonNullElse(stack.pop(), "Стек пуст"));
        }
    }


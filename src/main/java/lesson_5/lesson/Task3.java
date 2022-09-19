package lesson_5.lesson;

import java.util.LinkedList;
import java.util.Map;

public class Task3 {
    public static Map<Character, Character> bracketsMap = Map.of(
            '(', ')', '[', ']', '{', '}', '<', '>');

    public static void main(String[] args) {
        /*
        Написать программу, определяющую правильность расстановки скобок в выражении.
        Пример 1: a+(d*3) - истина
        Пример 2: [a+(1*3) - ложь
        Пример 3: [6+(3*3)] - истина
        Пример 4: {a}[+]{(d*3)} - истина
        Пример 5: <{a}+{(d*3)}> - истина
        Пример 6: {a+]}{(d*3)} - ложь
         */
        LinkedList<Character> linkedList = new LinkedList<>();
        String str = "<{a}+{(d*3)}>";
        for (char ch : str.toCharArray()) {
            if (bracketsMap.containsKey(ch)) {
                linkedList.push(ch);
            } else {
                if (bracketsMap.containsValue(ch)) {
                    if (linkedList.isEmpty()) {
                        System.out.println(false);
                        return;
                    }
                    Character closeBracket = linkedList.pop();
                    if (!bracketsMap.get(closeBracket).equals(ch)) {
                        System.out.println(false);
                        return;
                    }
                }
            }

        }
        System.out.println(linkedList.isEmpty());
    }
}

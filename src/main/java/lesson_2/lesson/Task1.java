package lesson_2.lesson;

public class Task1 {
    public static void main(String[] args) {
        //Увеличение суммы символов на кол-во раз числа number
        int number = 4;
        char c1 = 'a';
        char c2 = 'b';
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number; i++) {
            result.append(c1);
            result.append(c2);
        }
        System.out.println(result);
    }
}

package lesson_2.lesson;

public class Task3 {
    public static void main(String[] args) {
        //Палиндром символов
        String str = "сabcbab";
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("Это не палиндром");
                return;
            }

        }
        System.out.println("Это палиндром");
    }
}

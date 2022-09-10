package lesson_2.lesson;

import javax.imageio.IIOException;
import javax.swing.*;
import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        //Записать в фал 100 раз слово текст
        File file = new File("C:/MyLearning/java/Seminar_2/text.txt");//передать пусть к файлу и задать его в переменную
        try (BufferedReader br = new BufferedReader(new FileReader(file))) { //создание переменной для чтение файла
            br.readLine();//чтение файла
        } catch (IOException ex) {//информационные ошибки
            System.out.println(ex.getLocalizedMessage());//вывод ошибок
        }

        try (PrintWriter wr = new PrintWriter(file)) {//запись в файл
            wr.println(repeatText("text ", 100));
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    public static String repeatText(String arg, int count) {
        return String.valueOf(arg).repeat(Math.max(0, count));
    }
}

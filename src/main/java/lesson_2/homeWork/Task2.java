package lesson_2.homeWork;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        /*
        2. Дана строка sql-запроса "select * from students where ".
        Сформируйте часть WHERE этого запроса, используя StringBuilder.
        Данные для фильтрации приведены ниже в виде json строки. Если значение null,
        то параметр не должен попадать в запрос. Параметры для фильтрации:
        {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        Ответ: "select * from students where name =
        'Ivanov' and country = 'Russia' and city = 'Moscow'" для приведенного примера
         */
        File file = new File("C:/MyLearning/java/Seminar_2/sql.json");
        String data = fileReader(file);
        String[] array = arrayInfo(data);
        String getSql = sql(array);
        System.out.println(getSql);
    }
    private static String sql(String[] array) {
        StringBuilder builder = new StringBuilder("select *\n");
        builder.append(array [0]).append (" = ").append(array [1]).append (" and ").append (array [2]).append (" = ")
                .append(array [3]).append (" and ").append(array [4]).append (" = ").append (array [5]);
        if (array[array.length - 1].equalsIgnoreCase("null")){
            return builder.toString();
        } else {
            builder.append(" and ").append(array[array.length - 2]).append(" = ").append(array[array.length - 1]);
        }
        return builder.toString();
    }
    private static String[] arrayInfo(String data) {
        data = data.replace('"', ':').replace(',', ':').replace('{', ':')
                .replace('}', ':');
        String[] arrayData = data.split(":");
        String[] array = new String[arrayData.length];
        int count = 0;
        int index = 0;
        for (String i : arrayData) {
            if(i.equals("") || i.equals(" ")) {
                array[array.length - 1 - count] = i;
                count++;
            } else {
                array[index++] = i;
            }
        }
        String[] result = new String[index];
        System.arraycopy(array, 0, result, 0, index);
        return result;
    }
    private static String fileReader(File file) {
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            return bf.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return "infomation not found";
    }
}

package lesson_2.lesson;

public class Task2 {
    public static void main(String[] args) {
        //RLE алгоритм сжатия
        String str = "aaaaabbbbcdddd";
        StringBuilder rleStr = new StringBuilder();
        char firstSimbol = str.charAt(0);
        rleStr.append(firstSimbol);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (firstSimbol != str.charAt(i)) {
                if (count > 1) {
                    rleStr.append(count);
                    firstSimbol = str.charAt(i);
                    rleStr.append(firstSimbol);
                } else {
                    firstSimbol = str.charAt(i);
                    rleStr.append(firstSimbol);
                }
                count = 1;
            } else {
                count++;
            }
        }
        System.out.println("" + rleStr + count);
    }
}

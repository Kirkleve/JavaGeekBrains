package lesson_6.Seminar.Ex_1;


public class Main {
    public static void main(String[] args) {
        Text text = new Text("Мама мыла раму");
        Word word = new Word("раму");
        Word word1 = new Word("руки");
        WordReplacer wordReplacer = new WordReplacer();
        WordDeleter wordDeleter = new WordDeleter();
        TextAppend textAppend = new TextAppend();
        TextPrint textPrint = new TextPrint();

        textPrint.printText(text);
        Text text1 = new Text(wordReplacer.replaceWordInText(text, word, word1).getText());
        textPrint.printText(text1);
        Text text2 = new Text(wordDeleter.deleterWordInText(text1, word1).getText());
        textPrint.printText(text2);
        Text text3 = new Text(textAppend.appendText(text2, new Text(word.getWord())).getText());
        textPrint.printText(text3);

    }
}

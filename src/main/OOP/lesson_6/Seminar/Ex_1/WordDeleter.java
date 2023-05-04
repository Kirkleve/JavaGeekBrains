package lesson_6.Seminar.Ex_1;

public class WordDeleter {
    public Text deleterWordInText(Text text, Word wordToDelete) {
        String inputText = text.getText();
        if (inputText.contains(wordToDelete.getWord())) {
            inputText = inputText.replace(wordToDelete.getWord(), "");
        }
        return new Text(inputText);
    }
}

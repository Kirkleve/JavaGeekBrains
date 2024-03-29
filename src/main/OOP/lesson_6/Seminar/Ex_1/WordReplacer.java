package lesson_6.Seminar.Ex_1;

public class WordReplacer {
    public Text replaceWordInText(Text text, Word wordToReplace, Word newWord) {
        String inputText = text.getText();
        if (inputText.contains(wordToReplace.getWord())) {
            inputText = inputText.replace(wordToReplace.getWord(), newWord.getWord());
        }
        return new Text(inputText);
    }
}

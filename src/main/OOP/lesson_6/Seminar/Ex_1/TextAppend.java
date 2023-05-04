package lesson_6.Seminar.Ex_1;

public class TextAppend {
    public Text appendText(Text currentText, Text newText) {
        return new Text(currentText.getText() + newText.getText());
    }
}

package lesson_6.Seminar.Ex_2;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition(1.0, 3.0);
        Subtraction subtraction = new Subtraction(3.0, 1.0);
        Calculator calculator = new Calculator();
        calculator.calculateSwitch(addition);
        calculator.calculateCorrect(subtraction);
        System.out.println(addition.getResult());
        System.out.println(subtraction.getResult());
    }
}

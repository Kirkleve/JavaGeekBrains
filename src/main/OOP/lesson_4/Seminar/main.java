package lesson_4.Seminar;

import lesson_4.Seminar.data.Student;
import lesson_4.Seminar.data.Teacher;
import lesson_4.Seminar.data.UserComparator;
import lesson_4.Seminar.view.StudentView;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("techer1", "techer6", "teacher3", "date");
        Teacher teacher2 = new Teacher("techer1", "techer2", "teacher3", "date");
        UserComparator<Teacher> comp = new UserComparator<>();
        System.out.println(comp.compare(teacher1,teacher2));

        StudentView studentView = new StudentView();
        studentView.sendOnConsole(List.of(new Student("first","name","efsfs","24.2.24334")));
        System.out.println(studentView);
    }
}

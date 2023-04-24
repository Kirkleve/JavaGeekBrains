package lesson_4;

import lesson_4.data.Student;
import lesson_4.data.Teacher;
import lesson_4.data.UserComparator;
import lesson_4.view.StudentView;
import lesson_4.view.TeacherView;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("teacher1", "teacher3", "teacher3", "date");
        Teacher teacher2 = new Teacher("teacher1", "teacher2", "teacher3", "date");
        UserComparator<Teacher> comp = new UserComparator<>();
        System.out.println(comp.compare(teacher1,teacher2));

        StudentView studentView = new StudentView();
        studentView.sendOnConsole(List.of(new Student("first","name","efsfs","24.2.24334")));
        System.out.println(studentView);
        TeacherView teacherView = new TeacherView();
        teacherView.sendOnConsole(List.of(new Teacher("Mariy", "Petrovova", "fafaw", "14.4.4121")));
        System.out.println(teacherView);
    }
}

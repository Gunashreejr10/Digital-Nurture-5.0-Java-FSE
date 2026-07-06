

// Model
class Student {
    String name;
    int id;
    String grade;

    Student(String name, int id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}

// View
class StudentView {
    void displayStudentDetails(Student student) {
        System.out.println("Student: " + student.name + ", ID: " + student.id + ", Grade: " + student.grade);
    }
}

// Controller
class StudentController {
    private Student student;
    private StudentView view;

    StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    void updateGrade(String grade) { student.grade = grade; }
    void updateView() { view.displayStudentDetails(student); }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Riya", 101, "B");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateGrade("A");
        controller.updateView();
    }
}

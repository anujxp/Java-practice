
// 10. Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.
import java.util.ArrayList;
import java.util.Arrays;

class Student {
    String name;
    String grade;
    // String[] courses;
    ArrayList<String> courses = new ArrayList<String>();

    public Student(String name, String grade, String... course) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>(Arrays.asList(course));
    }

    public void addCourse(String course) {
        this.courses.add(course);
    }

    public void removeCourse(String course) {
        this.courses.remove(course);
    }

    public void display() {
        System.out.println("Name: " + name + "\nGrade: " + grade + "\nCourses: " + courses);

    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", courses=" + courses +
                '}';
    }


}
class TestMain{
    public static void main(String[] args) {
        Student student = new Student("John", "A", "Math", "Science", "English");
        System.out.println(student);
        student.addCourse("History");
        System.out.println(student);
        student.removeCourse("Math");
        System.out.println(student);
        student.display();
    }
}

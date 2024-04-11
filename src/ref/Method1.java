package ref;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student(); // 참조값(주소값)이 다르다. 얘는 001
        initStudent(student1, "학생1", 18, 90);
//        student1.name = "학생1";
//        student1.age = 18;
//        student1.grade = 90;

        Student student2 = new Student(); // 참조값(주소값)이 다르다. 얘는 002
        initStudent(student2, "학생2", 16, 80);
//        student2.name = "학생2";
//        student2.age = 16;
//        student2.grade = 80;

        printStudent(student1);
        printStudent(student2);
    }
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 성적: " + student.grade);
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
}

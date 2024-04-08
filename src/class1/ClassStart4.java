package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "학생1";
        student1.age = 17;
        student1.grade = 80;

        Student student2 = new Student();

        student2.name = "학생2";
        student2.age = 15;
        student2.grade = 70;

        Student[] students = new Student[]{student1, student2};

        for (Student s : students) {
           System.out.println("이름 = " + s.name + " 나이: " + s.age + " 점수 : " + s.grade);
        }
    }
}

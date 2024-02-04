package class1;

import java.util.ArrayList;

public class ClassStart2 {

    public static void main(String[] args) {

        String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentAges = {15, 16, 14, 20};
        int[] studentGrade = {90, 80, 50, 60};
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrade[i]);
        }

    }
}

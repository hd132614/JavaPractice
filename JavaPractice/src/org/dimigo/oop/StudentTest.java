package org.dimigo.oop;

import java.util.ArrayList;

/**
 * Created by HIPERCUBE on 15. 4. 17..
 */
public class StudentTest {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(13, 2, 3, 1));
        students.add(new Student(13, 2, 3, 2, "박명수"));
        students.add(new Student(13, 2, 3, 3, "정준하", "안산시"));
        students.add(new Student(13, 2, 3, 4, "정형돈", "서울시", "010-444-4444"));

        for (Student aStudent : students) aStudent.printStudent();
    }
}

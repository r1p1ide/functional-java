package filter;

import util.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Alexander", 21, 5);
        Student student2 = new Student("Irina", 22, 3);
        Student student3 = new Student("Dmitriy", 26, 6);
        Student student4 = new Student("Maria", 22, 4);
        Student student5 = new Student("Alexander", 18, 1);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        studentList.stream()
                .filter(s -> s.getCourse() < 5)
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("-----------------------------------");

        studentList.stream()
                .filter(s -> s.getName().equals("Alexander"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

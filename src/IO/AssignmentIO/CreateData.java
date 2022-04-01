package IO.AssignmentIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CreateData {
    public static void main(String[] args) throws IOException {
        File file = new File("src/IO/AssignmentIO/file.studat");
        List<Student> students = new ArrayList<>();
        List<String> course = new ArrayList<>();
        course.add("COSC600");
        course.add("COSC601");
        course.add("COSC602");

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file, true))) {
            Student st1 = new Student(43001, "SDC", "Mike", "Peterson", "Peterson@saskpolytech.ca", course);
            students.add(st1);
            Student st2 = new Student(43002, "SDC", "John", "Smith", "Smith@saskpolytech.ca", course);
            students.add(st2);
            Student st3 = new Student(43003, "SDC", "Steve", "Keith", "Keith@saskpolytech.ca", course);
            students.add(st3);
            Student st4 = new Student(43004, "SDC", "Shawn", "Mandes", "Mandes@saskpolytech.ca", course);
            students.add(st4);
            Student st5 = new Student(43005, "SDC", "Hana", "Scott", "Scott@saskpolytech.ca", course);
            students.add(st5);
            Student st6 = new Student(43006, "SDC", "Wiliam", "McDonald", "McDonald@saskpolytech.ca", course);
            students.add(st6);
            Student st7 = new Student(43007, "SDC", "Dion", "Moor", "Moor@saskpolytech.ca", course);
            students.add(st7);
            Student st8 = new Student(43008, "SDC", "Raymond", "Beltsky", "Beltsky@saskpolytech.ca", course);
            students.add(st8);
            Student st9 = new Student(43009, "SDC", "Edward", "Gilbert", "Gilbert@saskpolytech.ca", course);
            students.add(st9);
            Student st10 = new Student(43010, "SDC", "Mathew", "Doglas", "Doglas@saskpolytech.ca", course);
            students.add(st10);
            Student st11 = new Student(43011, "SDC", "Brad", "Brew", "Brew@saskpolytech.ca", course);
            students.add(st11);
            Student st12 = new Student(43012, "SDC", "Victor", "Bill", "Bill@saskpolytech.ca", course);
            students.add(st12);
            Student st13 = new Student(43013, "SDC", "Andy", "Folk", "Folk@saskpolytech.ca", course);
            students.add(st13);
            Student st14 = new Student(43014, "SDC", "Robert", "Majik", "Majik@saskpolytech.ca", course);
            students.add(st14);
            Student st15 = new Student(43015, "SDC", "Chelsea", "Ryde", "Ryde@saskpolytech.ca", course);
            students.add(st15);
            Student st16 = new Student(43016, "SDC", "Gilbert", "Gill", "Gill@saskpolytech.ca");
            students.add(st16);
            Student st17 = new Student(43017, "SDC", "Sarah", "Nik", "Nik@saskpolytech.ca");
            students.add(st17);
            Student st18 = new Student(43018, "SDC", "Ryan", "Neier", "Neier@saskpolytech.ca");
            students.add(st18);
            Student st19 = new Student(43019, "SDC", "Ronny", "Jackson", "Jackson@saskpolytech.ca");
            students.add(st19);
            Student st20 = new Student(43020, "SDC", "Teodor", "Jin", "Jin@saskpolytech.ca");
            students.add(st20);
        }
    }
}

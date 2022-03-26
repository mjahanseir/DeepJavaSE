package S12P2Comparable;

public class Student implements Comparable<Student>{
    private int studentNum;
    private String name;
    private int age;
    private int gpa;

    public Student(int studentNum, String name, int age, int gpa) {
        this.studentNum = studentNum;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }




    @Override
    public int compareTo(Student o) {
        if (this.gpa==o.gpa)
            return 0;
        else if (this.gpa < o.gpa)
            return -1;
        else
            return 1;
    }



}

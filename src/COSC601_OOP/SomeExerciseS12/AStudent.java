package SomeExerciseS12;

public class AStudent implements Comparable<AStudent> {
    private int studnetNum;
    private String name;
    private int age;
    private int gpa;

    public AStudent(int stunetNum, String name, int age, int gpa) {
        this.studnetNum = stunetNum;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getStudnetNum() {
        return studnetNum;
    }

    public void setStudnetNum(int studnetNum) {
        this.studnetNum = studnetNum;
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
    public int compareTo(AStudent st){
        if (this.gpa==st.gpa)
            return 0;
        else  if (this.gpa<st.gpa)
            return -1;
        else
            return 1;
    }
}



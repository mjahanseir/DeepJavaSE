package S8p1ClassRelationships;

public class Course {
    private String courseName;
    private String courseCode;

    private Instructor instructor;
    private Student[] student;

    //"Intro Programming" , "COSC601"
    public Course(String courseName, String courseCode, Instructor instructor, Student[] student) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
        this.student = student;
    }

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public Course(String courseName, String courseCode, String instName) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor= new Instructor(instName);

    }

}

package IO.AssignmentIO;
import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {

    private Integer studentId;
    private String program;
    private String fName;
    private String lName;
    private String email;
    private List<String> courses;

    public Student(Integer studentId, String program, String fName, String lName, String email) {
        this.studentId = studentId;
        this.program = program;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }

    public Student(Integer studentId, String program, String fName, String lName, String email, List<String> courses) {
        this.studentId = studentId;
        this.program = program;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.courses = courses;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}

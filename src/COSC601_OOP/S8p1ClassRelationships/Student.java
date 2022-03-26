package S8p1ClassRelationships;

public class Student {
    private String stdentNum;
    private String stdentName;
    private String address;

    public Student(String stdentNum, String stdentName) {
        this.stdentNum = stdentNum;
        this.stdentName = stdentName;
    }

    public String getStdentNum() {
        return stdentNum;
    }

    public void setStdentNum(String stdentNum) {
        this.stdentNum = stdentNum;
    }

    public String getStdentName() {
        return stdentName;
    }

    public void setStdentName(String stdentName) {
        this.stdentName = stdentName;
    }
}

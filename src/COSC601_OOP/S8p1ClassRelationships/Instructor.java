package S8p1ClassRelationships;

public class Instructor {
    private String emNum;
    private String name;
    private String office;
    private String email;

    public Instructor(String emNum, String name, String office, String email) {
        this.emNum = emNum;
        this.name = name;
        this.office = office;
        this.email = email;
    }

    public Instructor(String name) {
        this.name = name;
    }

    public String getEmNum() {
        return emNum;
    }

    public void setEmNum(String emNum) {
        this.emNum = emNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

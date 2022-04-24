package Network.Review;

import java.io.Serializable;

public class C5_StudentAddress implements Serializable {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    public C5_StudentAddress(String name, String street, String city, String state, String zip) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public String getName() {
        return name;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getZip() {
        return zip;
    }
}

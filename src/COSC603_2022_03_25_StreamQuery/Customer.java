package COSC603_2022_03_25_StreamQuery;
//01- Class
public class Customer {
    private int id;
    private String name;
    private Integer tier;

    //////////////////////   CONSTRUCTOR
    public Customer(int id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }
    //////////////////////   SETTER   &  GETTER
        public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getTier() {
        return tier;
    }
    public void setTier(Integer tier) {
        this.tier = tier;
    }
}

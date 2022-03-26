package zBrightSpace.LO5_Polymorphism.LO5LS2DynamicBinding;

public class Animal {

    private String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void speak()
    {
        System.out.println("Animals can't speak!");
    }
}




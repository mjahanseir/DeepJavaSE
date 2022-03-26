package zBrightSpace.LO5_Polymorphism.LO5LS2DynamicBinding;

public class  Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }

    public void speak()
    {
        System.out.println(getName() + " says Woof!");
    }
}
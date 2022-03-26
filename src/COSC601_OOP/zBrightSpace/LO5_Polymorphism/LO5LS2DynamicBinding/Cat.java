package zBrightSpace.LO5_Polymorphism.LO5LS2DynamicBinding;

public class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }

    public void speak()
    {
        System.out.println(getName() + " says Meow!");
    }
}
package zBrightSpace.LO5_Polymorphism.LO5LS2DynamicBinding;


import java.util.Scanner;

public class DemoPolymorphism
{
    public static void main(String[] args)
    {
        DemoPolymorphism demo = new DemoPolymorphism();
        // ask the user what type of animal to create
        Animal a = demo.createAnimal();
        // make that animal speak - uses polymorphism
        // this same statement will do different things
        // depending on the animal created
        a.speak();
    }

    public Animal createAnimal() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What type of animal do you want to create?");
        System.out.println("A) Animal\nC) Cat\nD) Dog");
        System.out.print("Your choice (A, C, D): ");
        char choice = keyboard.nextLine().trim().toUpperCase().charAt(0);
        System.out.print("Please enter the animal's name: ");
        String name = keyboard.nextLine();
        Animal result;
        switch (choice)
        {
            case 'A':
            default:
                result = new Animal(name);
                break;
            case 'C':
                result = new Cat(name);
                break;
            case 'D':
                result = new Dog(name);
                break;
        }
        return result;
    }
}


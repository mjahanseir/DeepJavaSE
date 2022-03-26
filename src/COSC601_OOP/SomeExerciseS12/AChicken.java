package SomeExerciseS12;

public class AChicken extends AAnimal implements AEdible,APackable{
    @Override
    public String makeSound() {
        return "DOCK_DOCK";
    }

    @Override
    public String howToEat() {
        return "BBQ" + x;
    }
}

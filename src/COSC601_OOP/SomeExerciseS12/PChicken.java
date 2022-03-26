package SomeExerciseS12;

public class PChicken extends PAnimal implements PEdible, PPackable{
    @Override
    public String makeSound() {
        return "Duck-Duck";
    }

    @Override
    public String howToEat() {
        return "BBQ"+ PEdible.x;
    }
}

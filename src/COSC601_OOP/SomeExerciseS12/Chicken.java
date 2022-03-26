package SomeExerciseS12;

public class Chicken extends Animal implements Ediable, Peckable {
    @Override
    public String makeSound() {
        return "BUck-Buck";
    }

    @Override
    public String howToEat() {
        return "BBQ"+ Ediable.x;
    }
}

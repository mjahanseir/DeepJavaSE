package SomeExerciseS12;

public abstract class PAnimal {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract String makeSound();
}

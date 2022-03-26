package AssignmentUML.AssignmentUML3;

//AccessBuses are used to provide transportation for people who can’t drive themselves.
// Some are equipped with wheelchair lifts and those lifts have a certain weight capacity in kilograms.
// Average length and passenger capacity values are 15 feet and 12 passengers.
public class AccessBus extends Bus {
    private boolean hasWheelchairLft;
    private int liftCapacity;

    public AccessBus(String licenceNum, boolean hasWheelchairLft,int liftCapacity){
        super(licenceNum);
        this.hasWheelchairLft=hasWheelchairLft;
        this.liftCapacity=liftCapacity;
    }
    public boolean hasLift(){
        return hasWheelchairLft;
    }


    public void setHasWheelchairLft(boolean hasWheelchairLft) {
        this.hasWheelchairLft = hasWheelchairLft;
    }

    public int getLiftCapacity() {
        return liftCapacity;
    }

    public void setLiftCapacity(int liftCapacity) {
        this.liftCapacity = liftCapacity;
    }


    @Override
    public String toString() {
        return "AccessBus{" +
                "hasWheelchairLft=" + hasWheelchairLft +
                ", liftCapacity=" + liftCapacity +
                '}';
    }

    @Override
    public int getTurnRadius() {
        return 15;
    }
}

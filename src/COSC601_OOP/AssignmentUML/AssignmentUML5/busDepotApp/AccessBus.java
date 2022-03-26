package AssignmentUML.AssignmentUML5.busDepotApp;

import AssignmentUML.AssignmentUML4.Stowable;

public class AccessBus extends Bus implements Stowable {
    private boolean hasWheelchairLft;
    private int liftCapacity;

    public AccessBus(String licenceNum, boolean hasWheelchairLft, int liftCapacity){
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
        return "AccessBus has " + hasWheelchairLft + "wheel chair lift, liftCapacity=" + liftCapacity ;
    }

    @Override
    public int getTurnRadius() {
        return 15;
    }

    @Override
    public boolean canStow() {
        return false;
    }
}

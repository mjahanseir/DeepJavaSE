package AssignmentUML.AssignmentUML4;

//This sub-class is used to describe a school bus.
// Average length and passenger capacity values are 25 feet and 20 passengers.
// For this class you should note whether or not the SchoolBus is equipped with a Stop Arm.
public class SchoolBus extends Bus implements Stowable {

    private boolean stopArmInstalled;

    public SchoolBus(String licenceNum, boolean stopArmInstalled) {
        super(licenceNum);
        this.stopArmInstalled = stopArmInstalled;
    }


    public boolean isStopArmInstalled(){
        return  stopArmInstalled;
    }
    public void setStopArmInstalled(){
        this.stopArmInstalled=stopArmInstalled;
    }

    @Override
    public String toString() {
        return "School Bus's stopArmInstalled is" + stopArmInstalled;
    }

    @Override
    public int getTurnRadius() {
        return 20+20;
    }

    @Override
    public boolean canStow() {
        return true;
    }
}

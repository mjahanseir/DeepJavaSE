package AssignmentUML.AssignmentUML2;
//This sub-class is used to describe a school bus.
// Average length and passenger capacity values are 25 feet and 20 passengers.
// For this class you should note whether or not the SchoolBus is equipped with a Stop Arm.
public class SchoolBus extends Bus{

    private boolean stopArmInstalled;

    public SchoolBus(String licenceNum, boolean stopArmInstalled) {
        super(licenceNum);
        this.stopArmInstalled = stopArmInstalled;
    }

    public SchoolBus(int sizeEngine, int busLength, int passengerCapacity, String licenceNum, boolean stopArmInstalled) {
        super( sizeEngine, 25, 20, licenceNum);
        this.stopArmInstalled = stopArmInstalled;
    }

    public boolean isStopArmInstalled(){
        return  stopArmInstalled;
    }
    public void setStopArmInstalled(){
        this.stopArmInstalled=stopArmInstalled;
    }
    //For the abstract method getTurnRadius(),
    // you will calculate a school bus’s turn radius to be equal to its length+ 20 feet.
    @Override
    public int getTurnRadius() {
        return 20+20;
    }
}

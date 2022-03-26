package AssignmentUML.AssignmentUML5.busDepotApp;

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
        return 25+20;
    }

    @Override
    public boolean canStow() {
        return true;
    }
}

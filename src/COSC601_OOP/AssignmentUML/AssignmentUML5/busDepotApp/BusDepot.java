package AssignmentUML.AssignmentUML5.busDepotApp;

import java.util.ArrayList;

public class BusDepot {

  private int turnAroundSize;
    private int maxPassengers;
    private ArrayList<Bus> busParking;

    public BusDepot(int turnAroundSize, int maxPassengers){
        this.turnAroundSize=turnAroundSize;
        this.maxPassengers=maxPassengers;
    }


    public boolean canEnter(Bus bus){
        return (turnAroundSize > bus.getTurnRadius() && maxPassengers>bus.getPassengerCapacity());
    }

   public boolean addBus(Bus bus){
        return (busParking.add(bus));
    }

    public ArrayList<Bus> getBusList(){
        return  busParking;
    }

    @Override
    public String toString() {
        return "BusDepot{" +
                "turnAroundSize=" + turnAroundSize +
                ", maxPassengers=" + maxPassengers +
                ", busParking=" + busParking +
                '}';
    }
}

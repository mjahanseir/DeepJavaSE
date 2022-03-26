package AssignmentUML.AssignmentUML4;

import java.util.ArrayList;

public class BusDepot {
    //1. turnAroundSize - represents the room available for a bus to turn around in feet.
    //2. maxPassengers - represents the maximum number of passengers (per bus) that the Depot allows.
    //3. busParking - is a list of Buses that can park at the Bus Depot
    private int turnAroundSize;
    private int maxPassengers;
    private ArrayList<Bus> busParking;

    public BusDepot(int turnAroundSize, int maxPassengers){
        this.turnAroundSize=turnAroundSize;
        this.maxPassengers=maxPassengers;
    }

    //The turnAroundSize value is greater than the turnRadius which is based on bus length for the given bus.
    //Only buses with less than the given value for maxPassengers can park at the depot.
    public boolean canEnter(Bus bus){
        return (turnAroundSize > bus.getTurnRadius() && maxPassengers>bus.getPassengerCapacity());
    }
    //The method addBus will attempt to add a Bus to the list of buses that can park at the Bus Depot.
// This method will return true if the bus was added to the list, false otherwise.
// Note that a bus must be able to park before being added...
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

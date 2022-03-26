package AssignmentUML.AssignmentUML4;

public interface Stowable {
    int MIN_LUGGAGE = 2;
    //  return true if a bus's
    //  luggageCapacityPerPassenger >= MIN_LUGGAGE.
    boolean canStow();
}

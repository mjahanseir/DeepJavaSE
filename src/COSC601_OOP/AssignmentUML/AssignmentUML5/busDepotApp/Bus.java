package AssignmentUML.AssignmentUML5.busDepotApp;

public abstract class Bus implements Comparable<Bus> {
    //Attributes
    private int sizeEngine;
    private int busLength;
    private int passengerCapacity;
    private String licenceNum;

    //Constructors
    public Bus(String licenceNum) {
        this.licenceNum = licenceNum;
    }

    public Bus(int sizeEngine, int busLength, String licenceNum) {
        this.sizeEngine = sizeEngine;
        this.busLength = busLength;
        this.passengerCapacity = 20;
        this.licenceNum = licenceNum;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getSizeEngine() {
        return sizeEngine;
    }

    public abstract int getTurnRadius();

    // The method equals will return true if another Bus has the same licence number as the current bus
    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o instanceof Bus) {
            Bus bus = (Bus) o;
            if (this.licenceNum == bus.licenceNum) {
                result = true;
            }
        }
        return result;
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(getClass().getName());
        str.append("<: " + licenceNum);
        str.append("> | <" + sizeEngine);
        str.append("> | <" + passengerCapacity);
        str.append(">");
        return str.toString();
    }
    @Override
    public int compareTo(Bus b){
        if(this.passengerCapacity== b.passengerCapacity)
            return 0;
        else if(this.passengerCapacity>b.passengerCapacity)
            return 1;
        else
            return -1;
    }

    public int compartor(Bus b){
        if(this.sizeEngine== b.sizeEngine)
            return 0;
        else if(this.sizeEngine>b.sizeEngine)
            return 1;
        else
            return -1;
    }
    }

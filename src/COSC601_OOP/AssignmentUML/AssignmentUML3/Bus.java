package AssignmentUML.AssignmentUML3;

public abstract class Bus implements Comparable<Bus> {
    private int sizeEngine;
    private int busLength;
    private int passengerCapacity;
    private String licenceNum;

    //Constructors - One which creates a bus with only a licence number and one which provides values for all attributes.
    // Note that the default number of passengers for a bus is 20.

    /**
     *
     * @param licenceNum
     */
    public Bus(String licenceNum) {
        this.licenceNum = licenceNum;
    }

    /**
     *
     * @param sizeEngine
     * @param busLength
     * @param passengerCapacity =20
     * @param licenceNum
     */
    public Bus(int sizeEngine, int busLength, int passengerCapacity, String licenceNum) {
        this.sizeEngine = sizeEngine;
        this.busLength = busLength;
        this.passengerCapacity = 20;
        this.licenceNum = licenceNum;
    }

    // setPassengerCapacity - setter for passengerCapacity.
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    // getPassengerCapacity - getter for passengerCapacity
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    // getSizeEngine - getter for sizeEngine
    public int getSizeEngine() {
        return sizeEngine;
    }

    // getTurnRadius is an abstract method which calculates and returns the minimum turn radius for a bus
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
    //The method toString should return a string that is made up of
    // <licence number> | <engine size> | <passenger capacity>
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

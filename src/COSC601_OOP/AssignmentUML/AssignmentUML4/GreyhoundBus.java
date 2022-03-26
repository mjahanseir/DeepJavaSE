package AssignmentUML.AssignmentUML4;
//This particular class is used to describe a bus that is used for highway transportation over long distance.
// Average length and passenger capacity values are 50 feet and 50 passengers.
// For Greyhounds you should take into account whether or not it has entertainment features available for passengers.
// Possible features are specified in the enumeration featureType.

import java.util.Arrays;

public class GreyhoundBus  extends Bus implements Stowable {

    private FeatureType[] entertainmentFeature;

    public GreyhoundBus(String licenceNum, FeatureType[] entairtainmentFeature) {
        super(licenceNum);
        this.entertainmentFeature = entairtainmentFeature;
    }

    public FeatureType[] getEntertainmentFeature() {
        return entertainmentFeature;
    }
    public boolean removeFeature(FeatureType.featureType feature ){
        return true;
    }
    public boolean addFeature(FeatureType.featureType feature ){
        return true;
    }

    @Override
    public String toString() {
        return "GreyhoundBus{" +
                "entertainmentFeature=" + Arrays.toString(entertainmentFeature) +
                '}';
    }

    @Override
    public int getTurnRadius() {
        return 50*50;
    }


//A Greyhound can carry 6 pieces of luggage per foot of length.
//Length x luggageperfoot / passengers = 50*6/50
    @Override
    public boolean canStow() {
        return true;
    }
}

package AssignmentUML.AssignmentUML5.busDepotApp;

import java.util.Arrays;
import AssignmentUML.AssignmentUML5.busDepotApp.FeatureType.*;
public class GreyhoundBus extends Bus implements Stowable {

    private FeatureType[] entertainmentFeature;

//    public GreyhoundBus(String licenceNum,) {
//        super(licenceNum);
////        entertainmentFeature = feature;
//    }


    public GreyhoundBus(String licenceNum, FeatureType[] feature) {
        super(licenceNum);
        this.entertainmentFeature = feature;
    }

    public FeatureType[] getFeatures() {
        return entertainmentFeature;
    }
    public boolean removeFeature(FeatureType feature ){
        return  equals(feature);
    }
    public boolean addFeature(FeatureType feature ){
        return equals(feature);
    }

    @Override
    public String toString() {
        return "GreyhoundBus entertainmentFeature=" + Arrays.toString(entertainmentFeature);
    }

    @Override
    public int getTurnRadius() {
        return 50*50;
    }


    @Override
    public boolean canStow() {
        return true;
    }
}

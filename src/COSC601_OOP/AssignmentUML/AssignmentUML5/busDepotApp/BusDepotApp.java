package AssignmentUML.AssignmentUML5.busDepotApp;

import java.util.ArrayList;

public class BusDepotApp {
    public static void main(String[] args) {
        SchoolBus sb= new SchoolBus("9898",true);
        GreyhoundBus gb= new GreyhoundBus("123", new FeatureType[]{FeatureType.Movies});
        AccessBus ab= new AccessBus("878787", true, 20);
         BusDepot bd= new BusDepot(20,20);

         ArrayList<SchoolBus> schoolBuses= new ArrayList<>();
         ArrayList<GreyhoundBus> greyhoundBuses= new ArrayList<>();
         ArrayList<AccessBus> accessBuses= new ArrayList<>();
         ArrayList<BusDepot> busDepots= new ArrayList<>();

        System.out.println(countMaxAbove(busDepots,19));



    }

    public static int countMaxAbove(ArrayList<BusDepot> busDepots, int passengers) {
        int maxPassengers = busDepots.size();
        int counter = 0;

        for (BusDepot busDepot : busDepots) {
            if (maxPassengers > passengers)
                counter++;
        }
        return counter;
    }

    public static Bus findBus(ArrayList<Bus> buses, Bus bus) {
        for (Bus b : buses) {
            if (bus.equals(b))
                return bus;
        }
        return null;
    }

    public static int countStowable(ArrayList<Bus> buses) {
        int result = 0;
        for (Bus b : buses) {
            if (b instanceof Stowable) {
                Stowable s = (Stowable) b;
                if (s.canStow())
                    result++;
            }
        }
        return result;
    }

    public static ArrayList<Bus> gatherOrphans(ArrayList<Bus> buses, ArrayList<BusDepot> depots ) {
        ArrayList<Bus> orphanList = new ArrayList<>();

        for (BusDepot d : depots) {
            for (Bus b : buses) {
                if(b.equals(d) && !(d.canEnter(b))){
                    orphanList.add(b);

                }

            }
        }
            return orphanList;
    }

    public static ArrayList<String> setFeatures(boolean movies,boolean gaming,boolean music) {

        ArrayList<String> feature = new ArrayList<>();
            if(movies){
                feature.add("Movies");
            }else if(gaming){
                feature.add("Gaming");
            }else if (music){
                feature.add("Music");
            }
            return feature;
    }


}
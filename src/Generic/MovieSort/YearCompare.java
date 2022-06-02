package MovieSort;

import java.util.Comparator;

public class YearCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getYear()-o1.getYear();
//        OR
//        if(o1.getYear() > o2.getYear())
//            return 1;
//        else if(o1.getYear() > o2.getYear())
//            return -1;
//        else
//            return 0;
    }
}

package MovieSort;

import java.util.Comparator;

public class RateCompare implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {

        
        return (int)(m2.getRating()-m1.getRating());
       
//       OR
//        if(m1.getRating() > m2.getRating())
//            return 1;
//        else if(m1.getRating() > m2.getRating())
//            return -1;
//        else 
//            return 0;
        
        
    }
}

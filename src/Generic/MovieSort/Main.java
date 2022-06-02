package MovieSort;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

ArrayList<Movie> listMovie= new ArrayList<>();
        listMovie.add(new Movie("Episode 7: Force Awakens", 8.3, 2015));
        listMovie.add(new Movie("Episode 4: Star Wars", 9.7, 1977));
        listMovie.add(new Movie("Episode 5: Empire Strikes Back", 9.8, 1980));
        listMovie.add(new Movie("Episode 6: Return of the Jedi", 9.4, 1983));
        listMovie.add(new Movie("Episode 8: The Last Jedi", 7.3, 2017));
        listMovie.add(new Movie("Episode 9: The Rise of Skywalker", 7.7, 2020));
        listMovie.add(new Movie("Episode 2: Attack of the Clones", 7.8, 2002));
        listMovie.add(new Movie("Episode 1: The Phantom Menace", 6.4, 1999));
        listMovie.add(new Movie("Episode 3: Revenge of the Sith", 8.3, 2005));

        System.out.println("**************    Regular Sort    ********************");

        Collections.sort(listMovie);
            System.out.println("Movies after sorting: ");
            for (Movie movie : listMovie)
                    System.out.println(movie.getName()+ "  " + movie.getRating() + " " + movie.getYear());
        System.out.println("**************    Year Compare    ********************");
        Collections.sort(listMovie, new YearCompare());
        for (Movie movie : listMovie)
            System.out.println(movie.getName()+ "  " + movie.getRating() + " " + movie.getYear());

        System.out.println("***************   Rate Compare   *********************");

        Collections.sort(listMovie, new RateCompare());
        for (Movie movie : listMovie)
            System.out.println(movie.getName()+ "  " + movie.getRating() + " " + movie.getYear());

    }

}

package MovieSort;

public class Movie implements Comparable<Movie>{

    private double rating;
    private String name;
    private int year;

    public Movie( String name, double rating, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie m){
         return this.name.compareTo(m.getName());
    }
}

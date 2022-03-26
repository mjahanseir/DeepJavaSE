package zBrightSpace.LO4_Inheritance_Interfaces.LO4LS6Practice461;

/**
 *  The Movie class is a subclass of Item.  The Movie class is designed to
 *  represent the individual videos that are available for rent.
 */
public class Movie extends Item
{
    private String rating; // The video rating ie PG 13
    private int length; // The length of the video in minutes
    private boolean wideScreen;  // true if the movie is in widescreen
    private int wsAvailable; // The number of widescreen format available

    /** Movie rating for PG */
    public static final String PG = "Parent Guidance";
    /** Movie rating for PG 13 */
    public static final String PG_13 = "PG 13";
    /** Movie rating for general  */
    public static final String GEN = "General";
    /** Movie rating for restricted  */
    public static final String RES = "Restricted";
    /** For movies not yet rated    */
    public static final String NYR = "Not Rated";


    /**
     * Default Constructor
     */
    public Movie()
    {
        //super(); // invoke the super constructor
        rating = NYR;
        length = 0;
        wideScreen = false;
        wsAvailable = 0;
    }

    /**
     * Constructor used to initialize the object values.
     * @param id The Item's id.
     * @param name The Item's name.
     * @param qty The total number of items in stock.
     * @param available The number of items not yet rented.
     * @param rating The movie rating.
     * @param len The length of the movie
     * @param wideScreen True if the movie is in wide screen
     * @param wsAvailable The number of movies available in wide screen
     */
    public Movie( int id, String name, int qty, int available,
                  String rating, int len, boolean wideScreen,
                  int wsAvailable)
    {
        super( id, name, qty, available );
        this.rating = rating;
        length = len;  // "this" is not required here because the compiler
        // can distinguish between the class attribute
        // and the local variable.
        this.wideScreen = wideScreen;
        this.wsAvailable = wsAvailable;
    }

    // get methods
    public String getRating()
    {
        return rating;
    }
    public int getLength()
    {
        return length;
    }
    public boolean isWideScreen()
    {
        return wideScreen;
    }
    public int getWsAvailable()
    {
        return wsAvailable;
    }

    // set methods
    public void setRating( String rating)
    {
        this.rating = rating;
    }
    public void setLength( int len )
    {
        length = len;
    }
    public void setWideScreen( boolean ws )
    {
        wideScreen = ws;
    }
    public void setWsAvailable( int available )
    {
        wsAvailable = available;
    }

    /**
     * This method will display the attribute values of this class
     * @return A string representation of this class.
     */
    public String toString()
    {
        StringBuffer str = new StringBuffer( super.toString() );
        str.append( "[" );
        str.append( "rating=" + rating );
        str.append( ", length=" + length );
        str.append( ", wideScreen=" + wideScreen );
        str.append( ", wsAvailable=" + wsAvailable );
        str.append( "]" );
        return str.toString();
    }

    /**
     * This method will compare all the attributes of the Movie and return true
     * if the movies are the same
     * @param obj The other object to compare
     * @return true if the objects are the same
     */
    public boolean equals( Object obj )
    {
        boolean result = false;
        if ( obj instanceof Movie )
        {
            Movie movie = (Movie)obj; // cast the object to an Item
            if ( super.equals( obj )  && rating.equals( movie.rating ) &&
                    length == movie.length &&
                    wideScreen == movie.wideScreen &&
                    wsAvailable == movie.wsAvailable )
            {
                result = true;
            }
        }
        return result;
    }
}
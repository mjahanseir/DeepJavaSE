package zBrightSpace.LO4_Inheritance_Interfaces.LO4LS6Practice462_Clone;
/**
 *  The Game class is a subclass of Item.  The Game class is designed to
 *  represent the individual games that are available for rent.
 */
public class Game extends Item
{
    private String platform; // The platform the game is made for i.e. PS2
    private int minAge; // The minimum recommended age of for the game
    private String category;  // The category of the game i.e. RPG, sports, arcade

    /**
     * Default Constructor
     */
    public Game()
    {
        //super(); // invoke the super constructor
        platform = "";
        minAge = 0;
        category = "";
    }

    /**
     * Constructor used to initialize the object values.
     * @param id The Item's id.
     * @param name The Item's name.
     * @param qty The total number of items in stock.
     * @param available The number of items not yet rented.
     * @param age The minimum age recommended to play the game.
     * @param platform The platform the game is to be played on ie PS2
     * @param category The category of game ie sports, RPG, arcade, etc
     */
    public Game( int id, String name, int qty, int available,
                 int age, String platform, String category )
    {
        super( id, name, qty, available );
        minAge = age;
        this.platform = platform;
        this.category = category;
    }

    // get methods
    public int getMinAge()
    {
        return minAge;
    }
    public String getPlatform()
    {
        return platform;
    }
    public String getCategory()
    {
        return category;
    }

    // set methods
    public void setMinAge( int age )
    {
        minAge = age;
    }
    public void setPlatform( String platform )
    {
        this.platform = platform;
    }
    public void setCategory( String category )
    {
        this.category = category;
    }

    /**
     * This method will display the attribute values of this class
     * @return A string representation of this class.
     */
    public String toString()
    {
        StringBuffer str = new StringBuffer( super.toString() );
        str.append( "[" );
        str.append( "minAge=" + minAge );
        str.append( ", platform=" + platform );
        str.append( ", category=" + category );
        str.append( "]" );
        return str.toString();
    }

    /**
     * This method will compare all the attributes of the Game and return true
     * if the games are the same
     * @param obj The other object to compare
     * @return true if the objects are the same
     */
    public boolean equals( Object obj )
    {
        boolean result = false;
        if ( obj instanceof Game )
        {
            Game game = (Game)obj; // cast the object to a Game
            if ( super.equals( obj ) && minAge == game.minAge &&
                    platform.equals( game.platform ) &&
                    category.equals( game.category ) )
            {
                result = true;
            }
        }
        return result;
    }

    /**
     * Return a deep clone of the Game object.
     * @return A clone of the object.
     */
    public Game clone()
    {
        return (Game)super.clone();
    }
}

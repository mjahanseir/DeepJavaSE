package zBrightSpace.LO4_Inheritance_Interfaces.LO4LS4Practice442;

    /**
     *  The Item class is intended to be a base class for all the items that
     *  the video store will be renting to customers.  It provides basic methods
     *  and attributes common to all items in the video store inventory.
     */
    public class Item  // by default Item extends Object
    {
        private int id; // unique item id
        private String name; // The name or title of the Item
        private int quantity; // The total number of items in stock
        private int available; // The number of items available to rent

        /**
         * Default Constructor
         */
        public Item()
        {
            id = 0;
            name = "";
            quantity = 0;
            available = 0;
        }

        /**
         * Constructor used to initialize the object values.
         * @param id The Item's id.
         * @param name The Item's name.
         * @param qty The total number of items in stock.
         * @param available The number of items not yet rented.
         */
        public Item( int id, String name, int qty, int available )
        {
            this.id = id;
            this.name = name;
            this.quantity = qty;
            this.available = available;
        }

        // get methods
        public int getID()
        {
            return id;
        }
        public String getName()
        {
            return name;
        }
        public int getQuantity()
        {
            return quantity;
        }
        public int getAvailable()
        {
            return available;
        }

        // set methods
        public void setId( int id )
        {
            this.id = id;
        }
        public void setName( String name )
        {
            this.name = name;
        }
        public void setQuantity( int qty )
        {
            quantity = qty;
        }
        public void setAvailable( int available )
        {
            this.available = available;
        }

        /**
         * This method will display the attribute values of this class
         * @return A string representation of this class.
         */
        public String toString()
        {
            StringBuffer str = new StringBuffer( getClass().getName() );
            str.append( "[" );
            str.append( "id=" + id );
            str.append( ", name=" + name );
            str.append( ", quantity=" + quantity );
            str.append( ", available=" + available );
            str.append( "]" );
            return str.toString();
        }

        /**
         * This method will compare all the attributes of the Item and return true
         * if the items are the same
         * @param obj The other object to compare
         * @return true if the objects are the same
         */
        public boolean equals( Object obj )
        {
            boolean result = false;
            if ( obj instanceof zBrightSpace.LO4_Inheritance_Interfaces.LO4LS4Practice442.Item)
            {
                zBrightSpace.LO4_Inheritance_Interfaces.LO4LS4Practice442.Item item = (zBrightSpace.LO4_Inheritance_Interfaces.LO4LS4Practice442.Item)obj; // cast the object to an Item
                if ( id == item.id && name.equals( item.name ) &&
                        quantity == item.quantity &&
                        available == item.available )
                {
                    result = true;
                }
            }
            return result;
        }
    }
## Collision Resolution in Hash Tables

When calculating locations to insert data, it is inevitable that the same location will result more than once. This is referred to as a collision. Two ways to resolve collisions in hash tables are :
- Separate Chaining
- Open Addressing

### Separate Chaining
With separate chaining, we don't store data directly in the hash table but, rather, the table locations store 
references to a secondary structure like an arraylist. Data then gets stored in the secondary structure. 
The way this works is that if a data value hashes to the same location as a previous value, it is added to 
the arraylist referenced at that location. 
In the following diagram, 'Dave' was inserted in the first location and, later, 'Joe' hashed to the same 
location and is added to the same arraylist.

        0	-> Dave  ->  Joe
        1
        2	-> Bob
        3
        4
        5


### Open Addressing
With Open Addressing, we store data values directly in the hash table. To resolve collisions, 
we calculate alternate locations if a collision occurs. 
For example, consider the above example:
        
        0	Dave
        1
        2	Bob
        3
        4
        5


Now Joe hashes to the same location as Dave. 
With open addressing, we will calculate an increment to use from the original location to an alternate. 
Its important that this process is also deterministic as the hashing function is. 
Three types of open addressing are:

        - Linear Probing
        - Quadratic Probing
        - Double Hashing

### Linear Probing

Linear Probing works using a linear equation. 
We will generally use the number of attempts as part of the equation but that will simply be something like

            linear hash(k) = hash(k) + attemptNum

In the above example, we would simply add 1 to the original hash location for Joe and place that string in cell 1. 
While this method is simple, it has a serious problem. It tends to cause clustering itself which is precisely 
what we want to avoid.


### Quadratic Probing

Quadratic Probing is similar except we use some form of quadratic equation which will generally involve the number of attempts but this time we will square that value. Placed into a quadratic equation, we might use something like:

        quadratic hash(k) = hash(k) + c1attemptNum + c2attemptNum2  

        where c1 and c2 are coefficients set to some value between 0 and 1.

Quadratic Probing will tend to produce greater increments for attempts >1, 
thereby spreading results out more and helping to reduce clustering.


### Double Hashing

With double hashing, the important idea is that the hash value is used to calculate the increment. Because this will not be a simple sequence of values, it is expected that the increments will be more like random values producing better spread and distribution. Examples of double hash are:

            double hash = hash1(k) + hash2(k) 

- where hash2(k) is a separate function such as

            (1 + hash1 (k) ) mod ( table size - 1) * attemptNum
.

            PRIME - (hash1(k) % PRIME)      
- where PRIME is the largest prime number smaller than the current table size.

### Deleting when using Open Addressing

- There is an important issue to be aware of when using open addressing: 
how to handle deleted items. 

- If we clear the spot where the item had been, any following Get operations can potentially fail 
because the initial Add for those items might have 'bounced' on that location and had to increment a second 
time to another location. 

- Its important that these calculations remain deterministic even after deletions occur. 
The solution to this is to replace the deleted item with a placeholder that is neither a data value or an open location. 
This way, calculations for Get operations can still 'bounce' off of these in the same way as when the item was initially added.

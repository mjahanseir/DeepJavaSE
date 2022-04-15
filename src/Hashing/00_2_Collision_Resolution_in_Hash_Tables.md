# Hash Tables
The search efficiency of an AVL tree approaches O(log2 n).  
Recall that a linear linked list has a search efficiency of O(n).  
A hash table has a search efficiency approaching O(1) – constant time.  
This means that search efficiency is independent of the number of elements in the data structure. 
However, the cost of this is in space. Keep this in mind as we proceed through the discussion.
      
### A hash table is made up of two parts:

The array, this is where references to data are stored.
The mapping function (aka the hash function). 
The function is a mapping from the input space (the key of the data) to the integer space that makes up the indices of the array.
Consider a simple example.  Start with an array of size 12.  The table will store strings.

                0 |     |
                1 |     |
                2 |     |
                3 |     |
                4 |     |
                5 |     |
                6 |     |
                7 |     |
                8 |     |
                9 |     |
                10|     |
                11|     |


We need a hash function.  There are many ways to construct a hash function.  
The function in this case, takes a string parameter (data and the key) and returns an integer between 0 and 11.  
In this case we will sum up the ASCII values of each character in the string.  
We will then mod the sum by 12 (the table size). First, add the name “Steve”.  
We run “Steve” through the hash function and that maps to 3.


                0 |  null   |
                1 |  null   |
                2 |  null   |
                3 |  Steve  |
                4 |  null   |
                5 |  null   |
                6 |  null   |
                7 |  null   |
                8 |  null   |
                9 |  null   |
                10|  null   |
                11|  null   |



Now add the name “Spark”.  
After running Spark through the hash function, a result of 6 is produced.  
This results in the following hash table:
  
                0 |  null   |
                1 |  null   |
                2 |  null   |
                3 |  Steve  |
                4 |  null   |
                5 |  null   |
                6 |  Spark  |
                7 |  null   |
                8 |  null   |
                9 |  null   |
                10|  null   |
                11|  null   |


Now try adding the string “Notes”.  Suppose "Notes" hashes to location 3.

                0 |  null   |
                1 |  null   |
                2 |  null   |
                3 |  Steve Notes |
                4 |  null   |
                5 |  null   |
                6 |  Spark  |
                7 |  null   |
                8 |  null   |
                9 |  null   |
                10|  null   |
                11|  null   |


* What happened?  
The hashing of “Notes” to the same location as “Steve” resulted in a collision: 
- a number of values hashing to the same index in the storage table.  
In a hash table a collision is likely to occur.  
*** There are many algorithms to deal with collisions such as:

- Probing algorithms (aka – Open Addressing) – move the element to another free space in the array.  Data is always stored in the array.
- Separate chaining – Requires a modification to the original array where each element of the array no longer directly stores data, rather, it stores a link or reference to some other data structure such as a linked list, binary search tree or AVL tree.

* How do we avoid the worst case scenario (all items hash to the same location)?

- Create a hash table that is large enough to result in few collisions (manage the size of the hash table and subsequently the hash function).
- Use a good hash function that does not produce too many collisions.  It should produce values that are evenly distributed across the indices of the array.


The ADT for a hash table has some of the same set of methods as the previous ADTs: 
- create, 
- delete, 
- search, and 
- clear. 
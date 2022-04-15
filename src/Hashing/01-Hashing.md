
## What is a hash function? 
What is a perfect hash function? 
What is a collision?
If you know the index of an element in the array, 
you can retrieve the element using the index in O(1) time. 
So, can we store the values in an array and use the key as 
the index to find the value? The answer is yes if you can 
map a key to an index. 
The array that stores the values is called a hash table. 
The function that maps a key to an index in the hash table is called a hash function.

How do you design a hash function that produces an index from a key? 
Ideally, we would like to design a function that maps each search key 
to a different index in the hash table. Such a function is called a 
perfect hash function. 
However, it is difficult to find a perfect hash function. 
When two or more keys are mapped to the same hash value, 
we say that a collision has occurred.

hr

## What is a hash code?
A typical hash function first converts a search key to an integer 
value called a hash code, and then compresses the hash code 
into an index to the hash table.


## What is the hash code for Byte, Short, Integer, and Character?
For a search key of the type byte, short, int, and char, simply cast it to int. 
So two different search keys of any one of these types will have different hash codes.


## How is the hash code for a Float object computed?
For a search key of the type float, use Float.floatToIntBits(key) as the hash code. 
Note that floatToIntBits(float f) returns an int value whose bit representation is 
the same as the bit representation for the floating number f. 
So, two different search keys of the float type will have different hash codes.


## How is the hash code for a Long object computed?
For a search key of the type long, simply casting it to int would not be a good choice, 
because all keys that differ in only the first 32 bits will have the hash code. 
To take the first 32 bits into consideration, divide the 64 bits into two halves and 
perform the exclusive or operator to combine the two halves. 
This process is called folding. So, the hashing code is
        int hashCode = (int)(key ^ (key >> 32));
Note that >> is the right-shift operator that shifts the bits 32 position to the right.

## How is the hash code for a Double object computed?
For a search key of the type double, first convert it to a long value using doubleToLongBits, 
then perform a folding as follows:
        long bits = Double.doubleToLongBits(key);
        int hashCode = (int)(bits ^ (bits >> 32));


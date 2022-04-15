
What is a hash function? 
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

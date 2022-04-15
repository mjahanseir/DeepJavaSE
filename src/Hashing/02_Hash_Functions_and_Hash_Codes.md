
## Hash Functions and Hash Codes
- How is the hash code for a String object computed?

The hashcode for a string in Java is
                (...((s0*b + s1)*b + s2)*b + ... + sn-2)*b + sn-1
 where b is 31.
  <hr>
- How is a hash code compressed to an integer representing the index in a hash table?

The hash code for a key can be a large integer that is out of the range for the hash table index. You need to scale it down to fit in the range of the index. Assume the index for a hash table is between 0 and N-1. The most common way to scale an integer to between 0 and N-1 is to use

                h(hashCode) = hashCode % N

To ensure that the indices are spread evenly, choose N to be a prime number greater than 2.
<hr>
- If N is a value of the power of 2, is N / 2 same as N >> 1?

  Yes.
<hr>
- If N is a value of the power of 2, is m % N same as m & (N - 1) for any integer m?

  Yes.
<hr>
- What is Integer.valueOf("-98").hashCode() and what is "ABCDEFGHIJK".hashCode()?

        new Integer("-98").hashCode() is -98 and"ABCDEFGHIJK".hashCode() is -331017146.
<hr>
- Suppose int N = 256, what is Integer.valueOf("-98").hashCode() % N and what is Integer.valueOf("-98").hashCode() & (N - 1)?
  
Integer.valueOf("-98").hashCode() % N is -98
                Integer.valueOf("-98").hashCode() & (N - 1) 158

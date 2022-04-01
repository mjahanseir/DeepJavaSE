1. I/O can be classified into text I/O and binary I/O.
Text I/O interprets data in sequences of characters.
Binary I/O interprets data as raw binary values.
How text is stored in a file depends on the encoding scheme
for the file. Java automatically performs encoding and
decoding for text I/O.


2. The InputStream and OutputStream classes are the roots of
all binary I/O classes.
FileInputStream/FileOutputStream associates a file for input/output.
Buffered InputStream/BufferedOutputStream can be used to wrap any
binary I/O stream to improve performance.
DataInputStream/DataOutputStream can be used to read/ write
primitive values and strings.


3. ObjectInputStream/ObjectOutputStream can be used to read/write
objects in addition to primitive values and strings.
To enable object serialization, the object’s defining class must
implement the java.io.Serializable marker interface.


4. The RandomAccessFile class enables you to read and write data
to a file. You can open a file with the r mode to indicate that it
is read-only, or with the rw mode to indicate that it is updateable.
Since the RandomAccessFile class implements DataInput and DataOutput
interfaces, many methods in RandomAccessFile are the same as those
in DataInputStream and DataOutputStream.
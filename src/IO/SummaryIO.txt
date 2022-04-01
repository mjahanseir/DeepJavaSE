File IO:
    -start w/ a file object
            FIle name=new FIle(“   path   “):
    -encapsulates the file as an object so we can work w/ it

    - next we need to create a communication mechanism to write to/read
      from the file
            File     ←—---Print Writer-------    Program
                     ------------------------>
    - instantiate PrintWriter w/ File object to set up an object to write
      text to file


        1.File file_name = new File()
        2.PrintWriter____=new Printwriter (file_name);
        3.call PrintWriter methods to write to file
        4. Close printWriter

For reading , we use the Scanner object
            Scanner name = new Scanner()
  - pass our file object in place of System.in
   Console input
            next(),nextline(),nextInt().........hasNext()

Text file encoding and decoding is done by java.One extra step is done/
Binary I/O is fastest.


Binary I/O:
       - have classes for both input + output
       - input Stream—File Input Stream
              Filter Input Stream—----------{    data Input Stream,Buffers Input Stream
              Object Input Stream

       - output Stream-FileOutputStream
               Filter Output Stream—-------------{ data output Stream, Buffers Output Stream
                 Object Output Stream

File FileOutPutStream  Program
        FileInputStream

File   DataOutput Stream   Program
        File Output Stream
       ______________

         We wrap files and filter using dataInput
Buffer just provide buffering

-Object can be read/written to files if:
                   -they are serializable
                  -this is a marker interface
  Class__________implements Serializable
           Note:-  this isn't trivial
              Static variable are excluded
            Objects which are non-serialized raise an exception
                         Add transient keyword


Random Access file:
    All binary files we’ve looked at are sequential
          -write in a particular order. : have to be read in the same order
     - also,you can’t skip over anything
    -can use Random access Files to get around this.
    Other binary files can be read OR written but not both
    -R.A.F’s can do both
          - We just have to specify opening then w/ ‘r’  or ‘rw’
             As to wether we’ll read or read and write
    Read and Write bytes of data but have particular methods to do this
     We can also move to a location though **
             seek()

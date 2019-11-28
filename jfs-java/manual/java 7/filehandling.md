# scenario
memory (RAM) - volatile data.
disk (harddisk) - persistent.

# requirement
persist data - database, files
File Handling is a mechanism of persisting data to the disk.

# terminology
Stream : Sequence of bytes travelling from a source to a destination.
InputStream and OutputStream
Keyboard > Program (reads information from an input stream)
(Keyboard, mouse, scannner) Keyboard is the standard input stream.
System.in
 
Program > monitor (program writes to the monitor)
Standard Output Stream
Sytem.out.println("Welcome");

# diagram
creating a diagram

# Story : Fox cheated the crow.
# Recipe : Write the story to a file.
# Ingredients : File, OutputStream, IOException, (Computer)
# Process:
1. Create a file
2. Create a FileOutputStream for the file.
3. write the bytes
4. flush the stream
5. close the stream
6. verify the data in the file.
# Snippets
new FileOutputStream(new File("output.txt")).write("Fox cheated the crow".getBytes());

# programs
# read and write bytes.

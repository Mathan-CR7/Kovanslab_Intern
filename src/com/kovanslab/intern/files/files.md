### File

A file is just a box inside your computer where data stays permanently

songs → mp3 file
photos → jpg file
notes → txt file

Java progarm  normally forgets everything after the main close()
File I/O is the one of the way to store information  outside the java program

### File I/O

Communication between your java program and a file stored on disk

1. Input (Read)
   take data from file and bring it into the program
   1.FileReader (FileReader reads 1 character at a time (slow))
   It reads from hard disk And hard disk is VERY slow compared to RAM
   2.BufferedReader
   Java reads from the RAM, not the disk
2. Output (Write)
   store data permanently inside a file


### Real Time use case

WhatsApp remembers chats
Games remember level
Browser remembers password

### Types of files

There are 2 main file types

1. Text File - human readable (.txt, .csv)
2. Binary File - machine readable (.dat, .class, images)


### NIO.2

New Input Output improved file system API introduced in Java 7
The File class mostly returned true / false.
NIO.2 throws specific exceptions.
Old File
poor error handling
hard to copy/move files

### Three Types

1.Path (the address of a file or folder)
2.Paths
3.Files

### Operations/ Method in NIO2.

1.Create Folder
2.Create File
3.Write Data into File
4.Read Data from File
5.Copy File
6.Move / Rename File
7.Delete File or Folder
8.Check File Exists

### Serializable

Serializable is a marker interface (an empty interface).

Converting object → file / byte stream
Converting file → object back into memory
### File

A file is just a box inside your computer where data stays permanently

songs → mp3 file
photos → jpg file
notes → txt file

Java progarm  normally forgets everything after the main close()
File I/O is the one of the way to store information  outside the java program

### File I/O

Communication between your java program and a file stored on disk

1. Input (Read)
   take data from file and bring it into the program
   1.FileReader (FileReader reads 1 character at a time (slow))
   It reads from hard disk And hard disk is VERY slow compared to RAM
   2.BufferedReader
   Java reads from the RAM, not the disk
2. Output (Write)
   store data permanently inside a file


### Real Time use case

WhatsApp remembers chats
Games remember level
Browser remembers password

### Types of files

There are 2 main file types

1. Text File - human readable (.txt, .csv)
2. Binary File - machine readable (.dat, .class, images)


### NIO.2

New Input Output improved file system API introduced in Java 7
The File class mostly returned true / false.
NIO.2 throws specific exceptions.
Old File
poor error handling
hard to copy/move files

### Three Types

1.Path (the address of a file or folder)
2.Paths
3.Files

### Operations/ Method in NIO2.

1.Create Folder
2.Create File
3.Write Data into File
4.Read Data from File
5.Copy File
6.Move / Rename File
7.Delete File or Folder
8.Check File Exists

### Serializable

Serializable is a marker interface (an empty interface).

Converting object → file / byte stream
Converting file → object back into memory

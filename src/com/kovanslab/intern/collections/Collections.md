### Collections in Java

    -> A collection is a framework that provides classes and interface to store and manipulate the group of objects dynamically
    -> Instead of arrays (fixed size)
             1.Dynamic
             2.Flexible

    -> Collections Contains
             1.List
             2.Set
             3.Queue


### ArrayList

        -> Maintans insertion order
        -> indexed based access
        -> Allows duplicates
        -> Dynamic Resizing


### LinkedList

        -> In linked list stores elements as nodes
        -> Each node contains data part , refference to the previous node and refference to the next node (Doubly LinkedList) 
        -> Used for fast insertion and deletion operations
        -> Maintains insertion order
        -> Allow Null values

### Vector

        -> A dynamic array
        -> Synchronized (Thread Safe)
        -> Accept null Values
        -> Maintains Insertion order
        -> Slower than ArrayList because Synchronization

### Stack

        -> Stack is a data structure that follows LIFO (Last in first out)
        -> Why Not Use ArrayList or LinkedList Means its allow random access Stack only access the top of element 
        -> Search Method is used only in Stack data structure

### Set

       -> A set is a Collection that doesnt allow Duplicate Values
       -> It Stores only the unique elements 
       -> It may or may not maintain the order (depends on implementation)

       Types :
             1. HashSet
             2. LinkedHashSet
             3. TreeSet

### HashSet

        -> No duplicates allowded
        -> No order guarantee
        -> Fast performance

### LinkedSet

        -> The Combination of HashSet and Linkedlist
        -> No duplicates
        -> Maintains insertion order

### TreeSet

        -> No duplicates
        -> Maintains Sorted order
        -> Internaly use red - black tree (Self Balancing tree)
        -> Time Complexity O(log n) because it uses tree 

### Queue

        -> First In First Out
        Types :
              1.Linkedlist as Queue
              2.Priority Queue
              3.ArrayDequeue

### Linkedlist as Queue

        -> It uses Doubly Linkedlist
        -> It Allows null Values
        -> Values added at rear
        -> O(1) for Insertion
        -> O(1) for Removel

### Priority Queue

        -> It uses mini heap memory
        -> Sort values by default
        -> O(log n)

### ArrayDeque

        -> double-ended queue (Deque)
        -> You can insert/remove from both ends
        -> Combination of queue and stack


### HashMap

        ->  In java HashMap=Array of buckets

### Collision when get

        -> Default capacity → 16
        -> Internally creates an array of 16 buckets
        -> map.put(1, "One")
        -> Compute hash For Integer, hashCode() = the integer itself hash(1) = 1.
        -> index = hash & (capacity - 1) => 1 index
        -> Index 1 → [1 = "One"]
        -> map.put(17, "Seventeen")
        -> hash(17) = 17 => 17 & 15 = 1 It also goes to index 1.
        -> This is called a collision.
        -> Index 1 → [1 = "One"] → [17 = "Seventeen"]

### example

         -> [1 = "One"] → [17 = "Seventeen"]
         -> 1.equals(17) → false
         -> 17.equals(17) → true
         -> Match found Return Value => "Seventeen"




    



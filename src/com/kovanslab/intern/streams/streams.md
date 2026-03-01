### Java Stream API

-> The Java Streams API Introduced in Java 8
-> Before Java 8, if you wanted to work with a list (filter, search, sort, count), you had to write loops + temporary variables + conditions.
-> A Stream is a pipeline that processes data from a collection (List, Set, etc.) step-by-step automatically
-> Stream is not a data structure
-> It does not store data
-> It only processes data

ex: teacher gives a box of fruits
Take only apples
Wash them
Count them


### Stages of Stream

    -> Every stream has 3 stages
    1 . Source
           -> Where Data Comes from
           ex: collections(list,set,map)
               Array

    2 . Intermediate Operations
            -> They modify the data — lazy, not executed immediately
            ex:
               filter()
               map()
               distinct()
               sorted()
    
    3 . Terminal Operations
            -> Actually produces result Without terminal operation  Stream never runs.
            ex:
               forEach()
               count()
               collect()

### Real World Example

               ex: Ecommerce Filter operation
                   products above 1000


### Functional Interface
           Predicate -> It checks a condition and returns:(True or False)
           Consumer -> uses the value (performs action)
           Function -> Takes value and return its new value

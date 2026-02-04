# Day 3: Arrays & Multi-Dimensional Logic

## Concepts: Jagged arrays, Array copying (System.arraycopy vs .clone()), Varargs.

### Jagged arrays

      -> A jagged array is a multi-dimensional array in which rows have different numbers of columns.
      -> Syntax for Declaration
          int[][] arr = new int[3][];
      -> Column Length is not fixed

        Real Life  Example:
                  -> Not every student takes the same number of subjects.

                     Student 1 → 2 subjects

                     Student 2 → 4 subjects

                     Student 3 → 1 subject

#### Jagged array vs Normal 2D array

       -> A normal 2D array is a matrix where every row has the same number of columns.
       -> In Normal 2D array column length is Fixed
       -> It mainly used for matrix operations like(+,-,*)


### Array Copying

       -> creating another array using values of an existing array.
####           -> Shallow Copy vs Deep Copy
                ->Shallow copy
                         ->Copies reference
                         ->Both arrays point to the same memory
                         ->Change in one → affects the other
                -> Deep Copy
                         ->Copies actual elements
                         ->Seperate Memory
                         ->Safe to Modufy

        Different Ways to Copy Arrays in Java
                    -> Manual Copying actual values using for loobs
                    -> Using System.arraycopy() method

        .clone() vs System.arraycopy()

        -> Both .clone() and System.arraycopy() copy array values into the new Memory
        ->.clone() it copies the whole array and best for Quick Copy
        ->System.array() You choose where to where and how many values copy into the new array


### Varargs (Variable Arguments)

        ->Uses ... so,a method accept any number of arguments (0, 1, many) of the same type.
        ->Introduced in Java 5

        Without varargs
           -> You need multiple overload method and you need to manually crate the array



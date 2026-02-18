### Checked And Unchecked Exception

### Checked Exception

     -> Compiler might force you to handle with try-catch or Using throw if you dont handle, the progarm not compile
     -> Example Exceptions:
             -> IOException (file read/write fails)
             -> FileNotFoundException (file path wrong)
             -> SQLException (DB connection /Query fails)
             -> ClassNotFoundException
             -> InterruptedException (Thread interrupted while sleeping/waiting)
             -> NoSuchMethodException (Method not found)
             -> NoSuchFieldException (Field not found)

### Unchecked Exception

    -> In unchecked exception compiler doesnot force to handle it
    -> It Happens Because of User Mistakes

    -> Example Unchecked Exceptions :
              -> ArithmeticException(When Arithmetic operation fails (ex:when we try to divide the number by 0))
              -> NullPointerException(when we use null object)
              -> ArrayIndexOutOfBoundsException (when we try to access the wrong index in array)
              -> StringIndexOutOfBoundsException ( when we try to access the wrong index in string)
              -> NegativeArraySizeException (When the array size goes bellow zero (arr.size()<0))



### Exception Handling Patterns

           -> The Exception Handling Patterns includes Try block ,Catch Block( it used to catch the exception), Finally block
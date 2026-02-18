### Generics

    Generics allow classes and methods to operate on different data types

1) Type Safety
   -> No wrong data goes inside collections.

2) No Type Casting
   -> Before Java 5 Integer x = (Integer) map.get("age");
   -> Now Integer x = map.get("age");

3) Code Reusability  - Write once → works for all data types.

4) Compile-time error detection

ex: Ecommerce Website Products ,Cart ,Order Items

### Bounded Type Parameters

-> It restricts what types are allowed in a generic.
-> <T extends SomeClass>

### Use Case

        -> Game Development
               Physics calculations:
                    -> health
                    -> damage (All numeric only)


### WildCards

      -> In generics Wildcards Represent Unknown Type
      -> ? Symbol represent Wildcard
      -> Used mostly with collections (List, Set, Queue, Map values)
      -> “I don’t know the exact type inside this collection… but I still want to work with it safely.”

### Why wildcards were needed

       -> List<String> names = new ArrayList<>();
          List<Object> obj = names;   //  compile error
          obj.add(100);   // Integer added
        Now names (which is a String list) contains an Integer.

      
      Types :
            1.UnBounded Wildcard
            2.Upperbounded Wildcard
            3.LowerBounded Wildcard

### Type Erasure

      -> Java Generics exist only at compile time. After compilation…Java literally removes the generic type.



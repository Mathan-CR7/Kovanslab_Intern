### Inheritance over Composition


### Association

       -> It Shows the RelationShip between the two seperate classes Where they can interact with each other but dont depend on each other
       -> It has two types of relationships
              -> IS A (It used in heritance)
              -> HAS A (It used in aggregation and composition)

### IS A Relationship

        -> Implemented using extends Keyword
        -> Method inheritance proves IS-A

### Aggregation - HAS A

        -> One class object is used in another class
        -> But class doesnt depend on eachother
        -> object reference → HAS-A

### Composition -PART OFF

        -> One class object is used in another class
        -> both classes depend on each other
        -> ex: Human has a Heart
               House has a Room

### Dependency Injection

        -> A dependency is simply one class using another class.            
        -> giving dependencies from outside instead of creating them inside

        Types:
              -> Constructor via dependency Injection
              -> Setter method via dependency Injection
              -> Field via dependency Injection
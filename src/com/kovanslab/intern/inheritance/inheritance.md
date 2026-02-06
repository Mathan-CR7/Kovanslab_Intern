## Pillers of OOPS

    -> Inheritance
    -> Pollymorphism
    -> Abstraction
    -> Encapsulation

### Inheritance

      -> It uses extends keyword
      -> In Inheritance  child class that inherit properties from the parent class.
                               (or)
      -> One Class Borrowing features of another class

### Why Inheritance

      -> Mainly Used for code reusability
      -> Easy Maintenance
      -> Clean code structure

### Types Of Inheritance

      -> Single Inheritance (One parent class One Child Class)
      -> Multilevel Inheritance (Grand parent class -> Parent Class -> Child Class)
      -> Hierarchical Inheritance (One Parent class -> Many Child Class)
      -> Multiple Inheritance (Not with classes we use interface)

### Polymorphism

      -> Polymorphism its just like method in many forms
      -> Same Method name but different behaviour 

### Types of Polymorphism

      -> Compile Time Pollymorphism (Method OverLoading)
      -> Run time Pollymorphism (Method Overriding)

### Compile Time Pollymorphism (Method OverLoading)

      -> In Method Overloading same method name but different parameters

### Runtime Pollymorphism (Method Overriding)

      -> Runtime polymorphism occurs when a child class overrides a method of the parent class, and the child class method is called at runtime when a parent class reference points to a child class object

### Covariant Return Type

      -> When a child class overrides a method, it can return a more specific object than the parent method.

### Final Method

      -> A final method cannot be overridden, but the class can be inherited

### Final class

      -> A final Class cannot be Inherited
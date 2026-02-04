### String
-> String is Immutable
-> Once a String is created, you can’t change it.
-> Any “change” it actually creates a new object in memory.

    Why

    -> Security (important for passwords, URLs, DB strings)

### StringBuilder

     -> Editable
     -> StringBuilder lets you change the same object without creating new ones.

     synatx : StringBuilder sb = new StringBuilder("Hello");


### When to Use What

    ->String → constants, small text.
    ->StringBuilder → loops, large text building


### StringBuffer vs StringBuilder

    -> StringBuffer → Thread-safe, synchronized, slower

    -> StringBuilder → Not thread-safe, not synchronized, faster

### Regex Pattern Matching

-> rules to spot text patterns.

1-Pattern
-> Defines what to search
-> Created once, reused many times
-> Pattern.compile()
2-Matcher
-> Does the actual searching
-> It contains Text
-> pattern.matcher()

### Core Methods

      -> matches()   	Whole string must match
      -> find()	        Finds pattern anywhere
      -> group()	    Returns matched part
      -> start()	    Start index
      -> end()	        End index


### Regex symbols

    -> . (Any Single Character)
       ex: a.c (exactly one char at middle)
            aec,aic(valid)
            ac(not valid)

    -> * (Zero or Many)
        ex: ab*
            abb,ab(Valid)
            b(not valid)

    -> + (One or Many )
        ex:ab+
           ab,abb(valid)
           a(not valid)

    -> ? (Optional Remove the previous character)
        ex:colou?r
           color,colour(valid)

    -> ^ (Starting index)
        ex:^Hii
          Hii there(valid)
          Say Hii(not valid)

    -> $ (Ending index)
        ex: end$
           the end(valid)
           end game(not valid)

    -> //d (Digits 0-9)
        ex://d{10}
            9798765434(valid)
            89bwhfdb67(not valid)

    -> //w (Word Character)
         It allows alphabets,numbers and underscore characters
         ex://w+
            Java_78(valid)
            java@78(not valid)

    -> [] charset(any one of these matching)
        ex:[a,e,i,o,u]
            a(valid)
            b(not valid)

    -> {} Exact count
        ex://d{10}
           8767564534(valid);
           453332(not valid);

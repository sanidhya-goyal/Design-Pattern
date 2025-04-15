# Strategy Pattern
The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from
clients that use it.

**Design Principle**
- Identify the aspects of your
application that vary and separate
them from what stays the same.
- Program to an interface, not an
  implementation.
- Favor composition over inheritance.


> [!NOTE] 
> Take the parts
that vary and encapsulate them, so that later you can
alter or extend the parts that vary without affecting
those that don’t.

    
  In our example -
  We know that fly() and quack() are the parts of the
  Duck class that vary across ducks.
  To separate these behaviors from the Duck class, we’ll
  pull both methods out of the Duck class and create a
  new set of classes to represent each behavior.

  ![Duck1.jpg](resources/Duck1.jpg)
  
![Duck2.jpeg](resources/Duck2.jpeg)

> [!IMPORTANT]
>OO Principles
>- Encapsulate what varies.
>- Favor composition over inheritence.
>- Program to interfaces, not implementations.

**OO Patterns**\
Strategy - defines a family of algorithms,
encapsulates each one, and makes them
interchangeable. Strategy lets the algorith



>“Program to an interface” really means
“Program to a supertype.”

The point is to exploit polymorphism by
programming to a supertype so that the actual runtime object
isn’t locked into the code. And we could rephrase “program to
a supertype” as “the declared type of the variables should be a
supertype, usually an abstract class or interface, so that the objects
assigned to those variables can be of any concrete implementation
of the supertype, which means the class declaring them doesn’t
have to know about the actual object types!”


Here’s a simple example of using a
polymorphic type – imagine an abstract class Animal, with two
concrete implementations, Dog and Cat.
Programming to an implementation would be:

> Dog d = new Dog();\
d.bark();

Declaring the variable "d" as type Dog (a concrete implementation of Animal) 
forces us to code to concrete implementation.

But programming to an interface/supertype would be:

> Animal animal = new Dog();\
animal.makeSound();

We know it's a Dog, but we can now use the animal reference polymorphically


**Abstraction**
**Encapsulation**
**Polymorphism**
**Inheritance**

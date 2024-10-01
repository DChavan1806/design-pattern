1. Prototype
- Prototype is a creational design pattern that lets you copy existing objects 
  without making your code dependent on their classes
- Enables the cloning or duplication of objects without having to know the exact class of the object being cloned. 
  Instead of instantiating new objects through constructors, the pattern allows you to make copies of objects by copying an existing instance.
- The Prototype Pattern may potentially violate a few design principles, particularly the Single Responsibility Principle (SRP) and the Liskov Substitution Principle (LSP), depending on its implementation.
- Applicability :
  1. When the cost of creating a new object is expensive (e.g., involves a lot of setup or computation).
  2. When you need to create multiple instances of an object that share most of their properties but may have small differences.
  3. When you want to avoid the overhead of using constructors or factories for object creation.
- Key Concepts:
  1. Prototype: The object that is cloned.
  2. Client: The code that asks for a clone of the prototype.
  3. Clone Method: A method that creates and returns a copy of the prototype object.

- How to Implement 
  1. Define the Prototype Interface (Cloning a Shape)
     - The Cloneable interface in Java is used for marking an object as cloneable, and clone() is the method used for creating copies.
  2. Concrete Implementations of Shape
     - Create specific implementations (e.g., Circle, Rectangle) of the Shape class that will be cloned.
  3. Prototype Registry
     - A class that holds the prototypes and allows clients to retrieve copies of them.
  4. Client Code
     - The client uses the ShapeCache to clone objects.

- Key Points:
  1. Cloning: The clone() method is used to create a shallow copy of an object. 
     Java’s Cloneable interface marks a class as cloneable, and Object.clone() handles the copying.
  2. Prototype Registry: ShapeCache holds instances of various shapes, and clients request clones from this registry. 
     This avoids repeated object creation through constructors.
  3. Immutable Object: The final product (House) is often immutable, meaning once it's built, its attributes can’t be changed.

- Pros and Cons :
  1. Reduces the need for complex object creation.
  2. Efficient when many similar objects need to be created, 
     especially when constructing objects is expensive.
- Deep vs. Shallow Copy:
  1. Shallow Copy: The default clone() method creates a shallow copy, 
     meaning fields that reference other objects are not cloned; only references are copied.
  2. Deep Copy: In a deep copy, all fields, including objects referenced by the original object, are cloned. 
     You’ll need to manually implement deep cloning if necessary by overriding clone() to recursively clone referenced objects.
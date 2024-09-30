1. Singleton
- Singleton is a creational design pattern that lets you ensure that a class has only one instance, 
  while providing a global access point to this instance
- Applicability :
   - The Singleton pattern solves two problems at the same time.
     1. Ensure that a class has just a single instance.
     2. Provide a global access point to that instance.
   - violating the Single Responsibility Principle.
   - Use the Singleton pattern when a class in your program should have just a single instance available to all clients; 
     for example, a single database object shared by different parts of the program.
   -  Use the Singleton pattern when you need stricter control over global variables.

- How to Implement 
  1. Make the default constructor private, 
     to prevent other objects from using the new operator with the Singleton class.
  2. Create a static creation method that acts as a constructor. 
     Under the hood, this method calls the private constructor to create an object and saves it in a static field. 
     All following calls to this method return the cached object.
- Real world analogy :
     1. The government is an excellent example of the Singleton pattern. 
     2. A country can have only one official government. 
     3. Regardless of the personal identities of the individuals who form governments, 
     4. the title, “The Government of INDIA”, is a global point of access that identifies the group of people in charge.

- Pros :
  1. You can be sure that a class has only a single instance.
  2. You gain a global access point to that instance.
  3. The singleton object is initialized only when it’s requested for the first time.
- Cons : 
  1. Violates the Single Responsibility Principle. The pattern solves two problems at the time.
  2.  The Singleton pattern can mask bad design, for instance, when the components of the program know too much about each other.
  3.  The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times.
  4. It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance when producing mock objects. Since the constructor of the singleton class is private and overriding static methods is impossible in most languages, you will need to think of a creative way to mock the singleton. Or just don’t write the tests. Or don’t use the Singleton pattern.
1. Abstract Factory
- The Abstract Factory Pattern is a creational design pattern that provides 
  an interface for creating families of related or dependent objects 
  without specifying their concrete classes. 
  It is useful when your system needs to support multiple product families, 
  and you want to ensure that the products from the same family are used together.
- Problem :
    - Imagine you're building a game where different kingdoms need their own distinct sets of objects 
      (such as kings, castles, and armies). 
      You can use the Abstract Factory to create families of related objects for each kingdom, like an Elf Kingdom or an Orc Kingdom.
      1. Interfaces for Kingdom Components: Each kingdom will have similar components, 
         such as Castle, King, and Army. These are defined as interfaces, 
         ensuring that each kingdom must implement them.
      2. Concrete Implementations: The Elf and Orc kingdoms will implement these interfaces. 
         For example, the Elven kingdom has its own ElfCastle, ElfKing, and ElfArmy.
      3. Kingdom Factories: Each kingdom will have its own factory that creates these components. 
         For example, the ElfKingdomFactory will produce elven versions of the objects.
      4. Factory Maker: This helper class can be used to decide which kingdom’s factory to instantiate, 
         based on user input or system configuration.
      5. Client Code: The client interacts only with the abstract interfaces a
         and doesn't need to know which concrete objects it is working with.

- Applicability
    - Use the Abstract Factory when your code needs to work with various families of related products, 
      but you don’t want it to depend on the concrete classes of those products—they might be unknown 
      beforehand or you simply want to allow for future extensibility.
    - The Abstract Factory provides you with an interface for creating objects from each class of the product family. 
      As long as your code creates objects via this interface, 
      you don’t have to worry about creating the wrong variant of a product which doesn’t match the products already created by your app.
- How to Implement 
  1. Map out a matrix of distinct product types versus variants of these products.
  2. Declare abstract product interfaces for all product types. Then make all concrete product classes implement these interfaces.
  3. Declare the abstract factory interface with a set of creation methods for all abstract products.
  4. Implement a set of concrete factory classes, one for each product variant.
  5. Create factory initialization code somewhere in the app. It should instantiate one of the concrete factory classes, depending on the application configuration or the current environment. Pass this factory object to all classes that construct products.
  6. Scan through the code and find all direct calls to product constructors. Replace them with calls to the appropriate creation method on the factory object.
- Pros and Cons :
  1. You can be sure that the products you’re getting from a factory are compatible with each other.
  2. You avoid tight coupling between concrete products and client code.
  3. Single Responsibility Principle. You can extract the product creation code into one place, making the code easier to support.
  4. Open/Closed Principle. You can introduce new variants of products without breaking existing client code. 
- Cons: 
  1. The code may become more complicated than it should be, 
      since a lot of new interfaces and classes are introduced along with the pattern.

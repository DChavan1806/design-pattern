1. Builder
- Builder is a creational design pattern that lets you construct complex objects step by step. 
  The pattern allows you to produce different types and representations of an object using the same construction code.
- pattern can potentially violate the Single Responsibility Principle (SRP) 
- Problem :
    - When an object requires many fields and some of them are optional.
    - When the object creation process is complex.
    - When the same object creation process should be reusable for different object representations.

- Applicability
    - The Builder Pattern is commonly used in libraries like StringBuilder in Java:
    - sb.append("Hello, ").append("World!").append(" How are you?");
    - the StringBuilder class allows you to build a String object piece by piece, 
      using method chaining similar to how the Builder pattern works. 
- How to Implement 
  1. Define the Product (House)
  2. Create the Builder Interface
  3. Create Concrete Builder
  4. Use the Builder to construct house or similar product
- Key Features of the Builder Pattern:
  1. Fluent API: Each method in the HouseBuilder interface returns the HouseBuilder object itself, allowing for method chaining.
  2. Optional Parameters: Using the Builder pattern, optional parameters like hasGarden and hasGarage can be set or left out.
  3. Immutable Object: The final product (House) is often immutable, meaning once it's built, its attributes can’t be changed.

- Pros and Cons :
  1. Clear Object Construction: It's easier to see how the object is constructed step by step.
  2. Reduced Complexity: You can avoid constructors with too many parameters.
  3. Flexible Construction: Different variations of the object can be created by using different sets of builder methods. 

- Cons: 
  1. The overall complexity of the code increases since the pattern requires creating multiple new classes.

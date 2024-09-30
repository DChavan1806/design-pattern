1. Factory Method
- is a creational design pattern that provides an interface for creating objects in a superclass, but
  allows subclasses to alter the type of objects that will be created.
- Problem :
    - logistic app with truck(road) and letter you got requirement for ship(sea logistic)
      you added all logic into single class and now if need add new functionality, you need to
      modify class and may result into breaking either existing functionality or nasty code or
      condition based code. which hard maintane and not readable.
- Solution :
    - The Factory Method pattern suggests that you replace direct object construction calls (using the new
      operator) with calls to a special factory method. Don’t worry: the objects are still created via the new operator, but it’s being called from within the factory method. Objects returned by a factory method are often referred to as products.
    - I am designing logistic app right. I will create refer to product object.

    - Logistic -> Transport :  planDelivery() -> createTransport();
    - createTranport() - > return truck() or return ship;
- Applicability
    - use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects
      your code should work with.
    - Use the Factory Method when you want to provide users of your library or framework with a way to
      extend its internal components.
    - Use the Factory Method when you want to save system resources by reusing existing objects instead of
      rebuilding them each time.
- How to Implement
    - Make all products follow the same interface. This interface should declare methods that make sense in every product.
    - Add an empty factory method inside the creator class. The return type of the method should match the common product interface.

Pros and Cons :
- You avoid tight coupling between the creator and the concrete products.
- Single Responsibility Principle. You can move the product creation code into one place in the program,   
  making the code easier to support.
- Open/Closed Principle. You can introduce new types of products into the program without breaking
  existing client code.
- Cons: The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.
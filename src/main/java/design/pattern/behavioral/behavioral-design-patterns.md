- Behavioral design patterns are concerned with algorithms 
  and the assignment of responsibilities between objects.

  1. Chain of Responsibility
  2. Command
  3. Iterator
  4. Mediator
  5. Memento
  6. Observer
  7. State
  8. Strategy
  9. Template Methode
  10. Visitor

1. Chain of Responsibility
   Intent: Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.
   Example: In an application, various handlers like logging, authentication, and validation are chained together, and each handler processes the request or passes it down the chain.

2. Command
   Intent: Encapsulate a request as an object, thereby allowing users to parameterize clients with queues, requests, and operations.
   Example: In an undo/redo functionality, each action (command) is encapsulated as an object with an execute() and undo() method.

3. Observer
   Intent: Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
   Example: In an event-driven system, subscribers (observers) get notified when an event (subject) occurs.

4. Strategy
   Intent: Define a family of algorithms, encapsulate each one, and make them interchangeable.
   Example: Sorting algorithms can be defined as strategies, and at runtime, the client can choose which one to apply.

5. State
   Intent: Allow an object to change its behavior when its internal state changes.
   Example: A finite state machine where the object changes behavior as it transitions through various states, like a document workflow moving from "draft" to "approved" to "published."

6. Mediator
   Intent: Define an object that encapsulates how a set of objects interact, promoting loose coupling by preventing direct references.
   Example: In a chat application, a mediator object manages communication between various participants, ensuring they don’t communicate directly.

7. Memento
   Intent: Capture and externalize an object's internal state so it can be restored later, without violating encapsulation.
   Example: Implementing a "save and restore" functionality in a text editor, where you can revert to previous states.

8. Visitor
   Intent: Represent an operation to be performed on elements of an object structure, allowing new operations to be added without changing the elements.
   Example: In a compiler, a visitor pattern can be used to traverse syntax trees and perform different actions depending on the node type.

9. Template Method
   Intent: Define the skeleton of an algorithm in a method, deferring some steps to subclasses without changing the algorithm's structure.
   Example: In a game development scenario, the general flow of a game loop is defined, but specifics like input handling or rendering are deferred to subclasses.

10. Iterator
    Intent: Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
    Example: Implementing a collection class (e.g., list, array) with an iterator that allows clients to traverse the elements without knowing how they’re stored.
    These patterns promote flexibility, maintainability, and scalability in software design by establishing common, reusable solutions for complex communication and interaction scenarios between objects.
  
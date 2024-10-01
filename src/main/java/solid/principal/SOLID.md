Solid Principle:
In Java, SOLID principles are an object-oriented approach that are applied to software structure design. 
It is conceptualized by Robert C. Martin (also known as Uncle Bob).
- SOLID Principle.
  1. Single responsibility Principle(SRP)
    Every class must perform Single functionality
    ex. bank service - loan/notification/print service
  2. open and close Principle(OCPs)
    according new requirement the module should be open for extension but close for modification.
    ex . notification class - sent otp for email and mobile
    notification interface - only abstract class - email and mobile class will implement it and later
    whatsapp class.
  3. Leskov Substitution Principle (LSP)
  inherit class such way that derived class/child class must be completely substitutable for there base/parent class.
  ex. Social media -
  chat/calls/post/sentMedia(). break down to chat/sentMedia() - Social media, post - post interface/Video call.
  4. ISP : Interface segregation principle
  larger interface split into smaller because implementation class could only use that are required
  we can not force client to use method which they do not required It is similar to SRP.
  ex. UPI payment : payMoney/sentMoney, getScratchCard, GetCashBackAsCreditBalance.
  Paytm : google-pay : phone pay -> move GetCashBackAsCreditBalance to cashBack interface
  5.  Dependency intervention principle (DIP)
  We must use abstraction (abstract classes + interface) than con create classes
  High level module should not depend on the low level module but both should depend on the abstraction.
   ex. Card payment -> debit/credit/ or any other card.
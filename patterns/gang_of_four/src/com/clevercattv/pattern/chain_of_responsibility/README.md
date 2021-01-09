# Chain of responsibility

## Description

Chain of Responsibility is a behavioral design pattern 
that lets you pass requests along a chain of handlers. 
Upon receiving a request, each handler decides either to process the request 
or to pass it to the next handler in the chain.

However, there’s a slightly different approach in which,
upon receiving a request, a handler decides whether it can process it. 
If it can, it doesn’t pass the request any further.

### Use when

* your program is expected to process different kinds of requests in various ways,
  but the exact types of requests, and their sequences are unknown beforehand
* it’s essential to execute several handlers in a particular order
* the set of handlers and their order are supposed to change at runtime
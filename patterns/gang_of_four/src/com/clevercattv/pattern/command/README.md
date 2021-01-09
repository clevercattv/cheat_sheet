# Command

## Description

Command is a behavioral design pattern that turns a request into a stand-alone object 
that contains all information about the request. 
This transformation lets you parameterize methods with different requests, 
delay or queue a request’s execution, and support undoable operations

### Use when

* you want to parametrize objects with operations
* you want to queue operations, schedule their execution, or execute them remotely
* you want to implement reversible operations

* pattern can turn a specific method call into a stand-alone object, so :
  * you can pass commands as method arguments
  * store them inside other objects
  * switch linked commands at runtime
# Factory

## Description

Factory Method is a creational design pattern that provides an interface 
for creating objects in a superclass, but allows subclasses to alter the 
type of objects that will be created.

The Factory Method pattern suggests 
that you replace direct object construction calls (using the `new` operator) 
with calls to a special factory method.

### Use when

* you don’t know beforehand the exact types and dependencies 
  of the objects your code should work with.
* you want to provide users of your library or 
  framework with a way to extend its internal components
* you want to save system resources by reusing existing objects 
  instead of rebuilding them each time

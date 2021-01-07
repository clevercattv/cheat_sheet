# Adapter

## Description

Convert the interface of a class into another interface the clients expect. 
Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

### Use when

* you want to use an existing class, and its interface does not match the one you need
* you need to use several existing subclasses, but it's impractical to adapt their interface by subclassing every one. 
  An object adapter can adapt the interface of its parent class
* most of the applications using third party libraries use adapters as a middle layer between the application 
  and the 3rd party library to decouple the application from the library. 
  If another library has to be used only an adapter for the new library is required without having to change the application code

### Consequences

* introduces only one object, and no additional pointer indirection is needed to get to the adapter
* makes it harder to override Adapter behavior. 
  It will require subclassing Adapter and making Adapter refer to the subclass rather than the Adapter itself.

### Examples 

* java.util.Arrays#asList()
* java.util.Collections#list()
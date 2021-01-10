# Composite

## Description

Composite is a structural design pattern that allows composing objects into a tree-like 
structure and work with it as if it was a singular object.

### Use when

* you have to implement a tree-like object structure
* you want the client code to treat both simple and complex elements uniformly.

### Attention

In cheat sheet was used simple structure. (component performs composite's tasks)

A bit more complex structure : 

* component – is the base interface for all the objects in the composition. 
  It should be either an interface, or an abstract class with the common methods 
  to manage the child composites.
* leaf – implements the default behavior of the base component. 
  It doesn't contain a reference to the other objects.
* composite – has leaf elements. 
  It implements the base component methods and defines the child-related operations.
* client – has access to the composition elements by using the base component object.

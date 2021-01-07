# Abstract factory

## Description 

Abstract Factory defines an interface for creating all distinct products 
but leaves the actual product creation to concrete factory classes. 
Each factory type corresponds to a certain product variety.

### Solves

* The problem of creating entire product families without specifying their concrete classes

### Use when

* The system should be configured with one of multiple families of products
* The family of related product objects is designed to be used together, and you need to enforce this constraint
* You want to decide which product to call from a family at runtime

### Consequences

* While the pattern is great when creating predefined objects, adding the new ones might be challenging
* The code becomes more complicated than it should be, 
  since a lot of new interfaces and classes are introduced along with the pattern
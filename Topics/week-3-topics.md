L1 Philosophy of OOP
Structured programming (many functions used to build complex systems)
Object oriented programming (data and methods)
State (attributes, stored in instance variables)
Methods manipulate the state

L2 Subclass and Inheritance
Subclass/child extends super class/parent
Subclass inherits properties and methods
Subclass can override parent's methods
Super() in child constructor
Parents are generalized, children are specialized
Private and finals aren't inherited by children
Object is base class in Java

L3 Dynamic dispatch and polymorphism
Polymorphism means many forms (same object can be either Animal or Mammal or Human)
Dynamic dispatch means automatically deciding which method to run
Overloading (same name methods in same class)
Overriding (child overrides parent's methods)
Type casting, type check using instanceof

L4 Java class hierarchy
Private and final prevents overriding
Object class at top in tree (provides basic methods like equals, to string etc)

L5 Subtyping, Inheritance
Class hierarchy provides both
Wherever a parent type is required, you can send a child type. Example: Where Car is required you can see Xylo. But where Xylo is required you can't send any Car (like Scorpio). Car is parent class of Xylo and Scorpio.
Inheritance: Reuse of implementation. Child can enjoy parent's methods. Can even override them.

L6 Java Modifiers
Public, private (control access)
Static, final (control behaviour)
When overriding, subclasses cannot reduce visibility
Public, private and static, final are orthogonal (independent, not related)

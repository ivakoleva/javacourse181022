<b>2018-10-24</b>

* age field deprecated
* introducing dateOfCreation
* getAge() reimplemented, using dynamic dateOfCreation-based calculation
* implement a concurrent queue (slide 36) using generics
* bootstrap and run 2 threads
    * one that pushes on stack
    * another that polls from stack, and prints to standard output

<b>2018-10-23</b>

Domain model:
* package
* class Person
* class Company
* interface / abstract class (that the classes above extend)
* age (integer)
__

Ceremonies:
* Entry point class (main method)

Implementation:
* Using lambda
    * populate person & company instances (generating number of age automatically)
    * assign them to type-safe collection(s)

<i>Bonus:</i>:
* implement helper class (utility class), that implements Comparator by (both domain classes) age
* sort the collection(s)
* print result to standard output

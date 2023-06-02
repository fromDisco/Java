# OOP

## Reference Variables
Variables that are initialized with objects are called reference variables. They are pointers to the address of the object in heap memory.

```java
# reference type     = object type
java.awt.Point point = new java.awt.Point()
```


## Garbage Collection

- Unused objects are deleted from the heap, by the garbage collector
- using more memory than allowed results in an **OutOfMemoryError**
- heap contains the objects
- heap size is dynamic, but can't be bigger than the main storage
- if object is deleted, or reference to it is overwritten by another refernce, the garbage collector, deletes this object.
- no trigger to excecute the garbage collector

```console
+-------------------------------------------+
| Main memory                               |
| +-----------------------------+ +---------+
| | JVM                         | | Browser |
| +-------+----------+----------+ +---------+ 
| |  HEAP | Metadata | Thread 1 | | Editor  |
| |   o   |          | Thread 2 | +---------+
| | o   o |          | Thread 2 | | Office  |
+ +-------+----------+----------+ +---------+
```
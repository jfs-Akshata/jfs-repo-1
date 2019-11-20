# Task 1
implement boolean addAll(int index,
               Collection<? extends E> c)

# task 2
add id field to Employee class
create a list containing PermanentEmployees
create a set containing VirtualEmployees
create a Map which stores (id as key) , (merged list and set as values)
# Generics
Generics allow you to customize a "generic" method or class to whatever type you're working with.
## brainstorm

public int Add(int a, int b)
public double Add(double a, double b)
public float Add(float a, float b)
Analyze : 2 parameters

public .... Add(.... a, ....b){
    return a+b;
}

public int Add(int a, int b){
    return a+b;
}
int Add(1,2);

public float Add(float a, float b){
    return a+b;
}
float Add(5.5f,6.5f);

public T Add<T>(T a, T b)

1. AddIntegers(int,int), AddFloats(float,float), AddDoubles(double,double)
2. Add(int,int), Add(float,float), Add(double,double)
3. Add<T>(T,T)

# LinkedList vs ArrayList
==========================
LinkedList and ArrayList are two different implementations of the List interface. LinkedList implements it with a doubly-linked list. ArrayList implements it with a dynamically re-sizing array.
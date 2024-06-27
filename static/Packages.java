
/*
                *** Packages ***
    
-   It is mechanism of organizing and grouping similar java files.
-   A group of related classes and interfaces put together to form a single entity and works for a
    common goal or functionality is known as Package.

    Package are classified into 2 Types:
    1) User-defined package
    2) Built in Packages


    1. Built in packages:
    The packages created by the developers of the language (Creators of the language) which are 
    directly available to use are known as built in packages. 
    e.g. java ---> lang, util, io, sql, awt, math

    2. User-Defined packages:
    The packages created by the programmer of the language (user of the language) is known as
    User-Defined packages.


    Advantages:
    1. Modularity of software increases.
    2. Maintainability of software improved,
    3. Security of software increases.
    4. Code reusability.
    e.g. Scanner class present in util package.

    */

class P{
     public void P1(){
        System.out.println("From P Class");
     }
}

class X{
    public P X1(){
        System.out.println("From X Class");
        return new P();
    }
}

class A{
    public X A1(){
        System.out.println("From A Class");
        return new X();
    }
}

public class Packages {
    public static void main(String[] args) {
        A a = new A();
        a.A1().X1().P1();
    }
}

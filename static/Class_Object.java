
/*
            *** Object ***

- Object is a block of memory, which is created at runtime in heap area which is representation
  real world entity.
  
NOTE:
- To create any object or before creating an object in real world, a design or blue print
  is created. It provides all the specification of an object.

Ex. 
- Before manufacturing a car, a blue print of car is created.
- Similarly in java before creating an object, the blue print must be created, which contain all the specification of that Object.
  This design is done with the help of class...


            *** Class ***

- A Class is a user defined non-premitive data type represent the blue print of an object and
  provide all the specification of an object.
  i.e. a class is used to create object

* Attributes or details of an object is represented by non-static variable.
* Actions or behavior are represented by non-static methods.


          *** New Keyword ***

- It is a keyword and an operator, which creates a block of memory in heap area at run time.
- New keyword gives the reference of object created and it returns it from heap area.


        *** QUE: How to create an object in java ? ***

- We can create object in java with the help of new operator (keyword) and a constructor of a class.


        *** Static and Non-Static Members ***

* Static member will be loaded only once, in class static area.
* Non-Static members will be loaded number of times we creating an object.

 */



class Car{
  String brand;
  String name;
  int no_of_wheel;
  double price;
  
  void Display(){
    System.out.println(brand);
    System.out.println(name);
    System.out.println(no_of_wheel);
    System.out.println(price);
  }

}

public class Class_Object {
    public static void main(String[] args) {
      Car c = new Car();
      c.Display();
    }
}




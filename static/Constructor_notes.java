
/*
            ********* Constructor Notes *********

1. Constructor is a special member of a class, also we can call special method of a class.
2. Constructor has same name as class name.
3. Constructor is used to load all non static members of a class to the object.
4. Constructor is used with new keyword.
   - New keyword allocate memory inside the heap
   - It create reference for an Object
5. Constructor has two Phases. 1) Load Instruction   2) Load User Defined Instruction
   - In LI, all the non-static members of a class are load inside object.
   - In LUDI, all statements written inside constructor body will be executed.
6. Constructor are of 3 three:
   - Default Constructor
   - No argument Constructor
   - Parameterized Constructor
7. Default Constructor---> When programmer not provide any constructor, compiler will add 
   one no-argument constructor, which is called as Default Constructor.
8. No argument Constructor---> Constructor which is not having any formal argument is called 
   no-argument constructor.
9. Parameterized Constructor---> Constructor with formal argument is known as Parameterized 
   Constructor.

   ORDER OF EXECUTION:
   - Invocation of constructorz
   - Non static declare and initialization Instruction
   - Non static variables and non static block
   - User defined Instruction of constructor
   - Constructor execution Ends

 */

class Test{
   String brand;
   double price;
   String color;
   String name;

   Test(){
      System.out.println("From the constructor!!");
   }

   void Display(){
      System.out.println(brand);
      System.out.println(price);
      System.out.println(color);
      System.out.println(name);
   }
   
}

public class Constructor_notes {
   public static void main(String[] args) {
      Test t1 = new Test();

      t1.Display();
   }  
    
}


/*
            **** Static Initializers ***

- Static Initializers are the members which get executed during loading process of a class.
- i.e. Static Initializers are Executed before the execution of main method.

Use of Static Intitializers:
- To assign value to the static data member.\
- It can also be used to perform some activities like setting up environment etc before the
  actual execution start.

Types of Static Initializers:
    1) Static declare Initilization statement
    2) Static Block

1. Static Declare Intialization Statement:
   Declaring static variable and storing value directly.

   Syntax: [Access_modifier] static Datatype var = val/exp;
   
2. Static Block:
   A block which is declared in class block and prefix with static modifier, is known as static block.

   Syntax: Static
            {
                // statements
            }

    NOTE:
    - Static block does not have any name.
    - It can not return any value (no return type)
    - It can not have any access modifiers.
    - It does not have any formal argument therefore a programmer can not call a static 
      block for execution explicitly.


- QUE : When does a static block get executed ?
  ANS : Before the actual execution start (Before the main method)
  
 NOTE: 
 - In a clas  we can have any number of static block.
 - The static initializer (block) execute from top to bottom order.


*/


public class StaticInitializer {
    
}

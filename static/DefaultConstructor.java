
/*

- Whenever programmer not giving any constructor, Compiler will there own no argument constructor,
 This is called Default Constructor.

 */

 
class Test{
    String brand = "Mobile";
    double price;
    String color;
    String name;
 
    // Compiler will add there own default constructor
    // Test(){   }
 
    void Display(){
       System.out.println(brand);
       System.out.println(price);
       System.out.println(color);
       System.out.println(name);
    }
    
 }
 
 public class DefaultConstructor {
    public static void main(String[] args) {
       Test t1 = new Test();
 
       t1.Display();
    }  
     
 }
 


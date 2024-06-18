
/* 
                        *** No Argument Constructor ***

- The constructor which not accept any formal argument is called as No Argument constructor.
- We can load all non static members of class into object but cannot initialize them using
  no-argument constructor.

 */
 
 class Test{
    String brand = "Mobile";
    double price;
    String color;
    String name;
 
    Test(){ 
        System.out.println("No argument Constructor !!!");
    }
 
    void Display(){
       System.out.println(brand);
       System.out.println(price);
       System.out.println(color);
       System.out.println(name);
    }
    
 }
 
 public class NoArgumentConstructor {
    public static void main(String[] args) {
       Test t1 = new Test();
 
       t1.Display();
    }  
     
 }
 


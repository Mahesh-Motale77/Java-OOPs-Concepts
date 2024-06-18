/*
                *** Parameterized Constructor ***

- The constructor which accepts the formal arguments are called as Parameterized Constructor.
- In parameterized constuctor, we assign values to the non-static members of a class.
 
*/

class Test{
    String brand = "Mobile";
    double price;
    String color;
    String name;

    // Parameterized Constructor
    Test(String brand, double price, String color, String name){ 
        System.out.println("Paramenterized Constructor !!!"); 
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.name = name;
    }
 
    void Display(){
       System.out.println(brand);
       System.out.println(price);
       System.out.println(color);
       System.out.println(name);
    }
    
 }
 
 public class ParameterizedConstructor {
    public static void main(String[] args) {
       Test t1 = new Test("Samsung", 150000, "blue", "S21");
 
       t1.Display();
    }  
     
 }
 


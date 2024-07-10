
// ************************ Lazy Binding ***************************

/*
 
- In lazy Binding, the instance of a dependant object is not created implicitly with the help 
  of non-static initializer, instead a method is created and a reference gets created in a main 
  object, when the method is called for execution, This method is called as a helper method.
  
*/

class PenDrive{
    String brand;
    double price;
    int storage; 
    double speed;

    PenDrive(){

    }

    PenDrive(String brand, double price, int storage, double speed){
        this.brand = brand;
        this.price = price;
        this.storage = storage;
        this.speed = speed;
    }

    public void displayPenDrive(){
        System.out.println(brand);
        System.out.println(price);
        System.out.println(storage);
        System.out.println(speed);
    }
}

class Computer{
    String brand;
    String os;
    int ram;
    int hd;
    String processor;

    PenDrive p1;

    Computer(){

    }

    Computer(String brand, String os, int ram, int hd, String processor){
        this.brand = brand;
        this.os = os;
        this.ram = ram;
        this.hd = hd;
        this.processor = processor;
    }

    // Helper Method
    public void InsertPenDrive(String brand, double price, int storage, double speed){
        p1 = new PenDrive(brand, price, storage, speed);
        System.out.println("PenDrive Inserted");
    }

    public void displayComputer(){
        System.out.println(brand);
        System.out.println(os);
        System.out.println(ram);
        System.out.println(hd);
        System.out.println(processor);
    }

}

public class ComputerDriver {
    public static void main(String[] args) {
        Computer c1 = new Computer("HP", "Window", 16, 1, "I7");

        c1.InsertPenDrive("SanDisk", 80000, 128, 50);

        c1.p1.displayPenDrive();      
    }
}

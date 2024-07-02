
/*
            *** Early Binding ***

- In Early Binding the instance of dependent object is implicitly created when the instance
  of a class is created.

- This design is achieve with the help of non-static initializers.

 */


class Battery{
    String brand;
    double mah;
    double price;

    Battery(){

    }

    Battery(String brand, double mah, double price){
      this.brand = brand;
      this.mah = mah;
      this.price = price;
    }

    public void displayBattery(){
      System.out.println(brand);
      System.out.println(mah);
      System.out.println(price);
    }
}


class Mobile{
  String model;
  String brand;
  int ram;
  int hd;
  double price;
  int cam;
  // Battery b1;

  Battery b1 = new Battery("Ambrance", 5000, 3000);

  public Mobile(){

  }

  Mobile(String brand, String model, int ram, int hd, double price, int cam){
    this.model = model;
    this.brand = brand;
    this.ram = ram;
    this.hd = hd;
    this.price = price;
    this.cam = cam;

    System.out.println("Mobile Created !!!");
  }

/* 
  Mobile(String brand, String model, int ram, int hd, double price, int cam, String batBrand, double mah, double cost){
    b1 = new Battery(batBrand,mah,cost);
    this.model = model;
    this.brand = brand;
    this.ram = ram;
    this.hd = hd;
    this.price = price;
    this.cam = cam;


    System.out.println("Mobile Created !!!");
  }
 */

  public void displayMobile(){
    System.out.println(brand);
    System.out.println(model);
    System.out.println(ram);
    System.out.println(hd);
    System.out.println(price);
    System.out.println(cam);
  }
}


public class MobileDriver{
  public static void main(String[] args) {
    Mobile m1 = new Mobile("samsung", "s24", 12, 512, 50000.0, 4);
    
    m1.displayMobile();
    m1.b1.displayBattery();

    /*
    Mobile m2 = new Mobile("samsung", "s24", 12, 512, 50000.0, 4, "cisco", 6000.0, 40);
    m2.displayMobile();
    m2.b1.displayBattery();
     */

  }
}
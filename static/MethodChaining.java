
/*
            *** Method Chaining ***

- Method chaining is the process of design for calling methods simultaneously one after another
  is called as method chaining.

  Syntax:
            reference.method1().method2().method3()

  We can call the methods in this passion only, if the methods returns a reference for another
  method to execute.

 */

class Fruit
{
    String name;
    double price;
    String color;
    String taste;

    Fruit(){

    }

    Fruit(String name, double price, String color, String taste){
        this.name = name;
        this.price = price;
        this.color = color;
        this.taste = taste;
    }

    public Fruit showName(){
        System.out.println(name);
        return this;
    }

    public Fruit showPrice(){
        System.out.println(price);
        return this;
    }

    public Fruit showColor(){
        System.out.println(color);
        return this;
    }

    public Fruit showTaste(){
        System.out.println(taste);
        return this;
    }
}

public class MethodChaining {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("mango", 150.0, "Yellow", "Kokam");
        f1.showName().showPrice().showColor().showTaste();
    }
}

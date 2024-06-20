
/*          
                *** Constructor Overloading ***

- A class having more than one constructor is known as Constructor Overloading.

Rules:
- Names of the constructor must be same.
- The formal arguments of the constructor, must changed either by its type or number of formal arguments.

Purpose
- We do constructor overloading when we want to customize the loading of the values to the object menmbers.

 */


class Form
{
    String name;
    String location;
    String email;
    long phno;
    String blood;
    double height;
    int weight;

    Form(){
        System.out.println("From no argument constructor...");
    }

    Form(String name, String location, String email, long phno, String blood, double height, int weight){
        this.name = name;
        this.location = location;
        this.email = email;
        this.phno = phno;
        this.blood = blood;
        this.height = height;
        this.weight = weight;
    }

    Form(String name, String location, String email, long phno){
        this.name = name;
        this.location = location;
        this.email = email;
        this.phno = phno;
    }

    Form(String name, String location, String email, long phno, String blood, double height){
        this.name = name;
        this.location = location;
        this.email = email;
        this.phno = phno;
        this.blood = blood;
        this.height = height;
    }

    Form(String name, String email, long phno){
        this.name = name;
        this.email = email;
        this.phno = phno;
    }
    
    void Display(){
        System.out.println(name);
        System.out.println(location);
        System.out.println(email);
        System.out.println(phno);
        System.out.println(blood);
        System.out.println(height);
        System.out.println(weight);
    }
    
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Form f1 = new Form();
        f1.Display();

        System.out.println("---------------------------------------------------");

        Form f2 = new Form("Mahesh", "Pune", "mahii@gmail.com", 7709586646l, "A+", 5.11, 65);
        f2.Display();

        System.out.println("---------------------------------------------------");

        Form f3 = new Form("Mahesh", "Pune", "mahii@gmail.com", 7709586646l, "A+", 5.11);
        f3.Display();

        System.out.println("---------------------------------------------------");

        Form f4 = new Form("Mahesh", "mahii@gmail.com", 7709586646l);
        f4.Display();

        System.out.println("---------------------------------------------------");

        Form f5 = new Form("mahesh", "mahi@gmail.com", 857951256965l);
        f5.Display();
    }
}

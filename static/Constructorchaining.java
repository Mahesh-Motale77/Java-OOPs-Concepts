
/*
            *** Constructor Chaining ***

- One constructor calling another constructor for execution is called as Constructor chaining.
- Constructor chaining can be achieved in 2 ways: 
        1) Using this() call statement
        2) Using super() call statement

 * this() call statement: It is used to achieve constructor chaining within the same class.
 * super() call statement: It is used to achieve constuctor chaining in two different classes (i.e. child to parent)
 
 Rules:
 1. this() call statement can only be used inside constructor body.
 2. This call statement must be first statement in constructor body.
 3. Recursive constructor call is not allowed.
    (Constructor calling itself is not allowed)
 4. If the class has N no. of constructors, we can use this() call statement in N-1 constructors.

 */

class Form{
    String name;
    String location;
    String email;
    long phno;
    String blood;
    double height;
    int weigth;

    Form(){
        System.out.println("Form Generated");
    }

    Form(String name, String location, String email, long phno, String blood, double height, int weigth){
        this(name,location, email, phno, blood, height);
        this.weigth = weigth;
    }

    Form(String name, String location, String email, long phno, String blood, double height){
        this(name, location, email, phno, blood);
        this.height = height;
    }

    Form(String name, String location, String email, long phno, String blood){
        this(name, location, email, phno);
        this.blood = blood;
    }

    Form(String name, String location, String email, long phno){
        this.name = name;
        this.location = location;
        this.email = email;
        this.phno = phno;
    }

    public void displayForm(){
        System.out.println(name);
        System.out.println(location);
        System.out.println(email);
        System.out.println(phno);
        System.out.println(blood);
        System.out.println(height);
        System.out.println(weigth);
    }
}

public class Constructorchaining {
    
    public static void main(String[] args) {
        Form f1 = new Form("Mahesh", "Pune", "mahesh@gmail.com",7709586646l,"A+",5.6, 70);
        f1.displayForm();
    }
}

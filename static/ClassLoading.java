
/*
                *** Class Loading Process ***

- A memory block will be created for the class and will be divided into different parts.
- All the method block will be loaded in method area, and if methods are static they are 
  stored in the table with the reference and signature in class static area.
- If there are any static variable they are given with the memory in the class static area 
  and will be assign with default value.
- If there are any static intializers they all of them will be executed in top to bottom order.
- This completes the loading preocess of the class.
- After this actual execution starts from the main method.


NOTE:
1. We cannot use a non static member inside the static context directly with its name.
2. We can use the static members inside the static context directly with it's name.
3. To use the non static memeber inside the static context we have to call it will object reference.

 */

public class ClassLoading {

    static int num;                                  // Static variable

    // get executed before main
    static String s = "Static variable";            // Static declare and Initialization statement

    String ns = "Non static variable";               // Non static variable

    static void displayStatic(){                     // Static Method
        System.out.println("Static method");
    }

    void displayNonStatic(){                        // Non static method
        System.out.println("Non static Method");
    }

    // get executed before main method
    static{                                            // Static block
        System.out.println("Welcome---------> Statement within the static block");
    }

    public static void main(String[] args) {
        ClassLoading c1 = new ClassLoading();

        // static members ----> can access directly
        System.out.println(num);
        System.out.println(s);
        displayStatic();

        // Non static members  -----> can access using object reference
        System.out.println(c1.ns);
        c1.displayNonStatic();

    }

}

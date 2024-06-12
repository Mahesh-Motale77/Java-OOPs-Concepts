

/*
                *** Multiple Classes ***

- If a java file contain more than one class, it is known as multiple classes.
- Here the compiler will create one class file for every class present in java file.

NOTE:
- In this case name of java file can be anything.


                *** Public class ***

- A class prefix with public access modifier is known as public class.
- Rule: When a class is made public the java file name should be same as class name, else
  will get CTE (Compile Time Error).

NOTE:
- We cannot have more than one public class in a single java file.
- We can achieve multiple class concept by having one public class and any number of default
  classes where the file name must be same as the public class name.
 
 */


public class MultipleClasses {
    public static void main(String[] args) {
        System.out.println("This is public class");
    }
}

class SecondClass{
    public static void main(String[] args) {
        System.out.println("This is second class");
    }
}

class ThirdClass{
    public static void main(String[] args) {
        System.out.println("This is Third class");
    }
}
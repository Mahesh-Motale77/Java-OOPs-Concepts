
/*              *** 1) Static Methods ***

- Methods which are prefix with static method known as Static Methods.
- We can call method from another class using class reference (i.e. ClassName.MethodName() ).
-The method body will be store in mothod area and method signature with it's reference will be stored in class static area.
- A static method we can use directly within the same class, with it's name and can also be used in different class with className as a reference.
- The static method block is called as a static context.
                
                
*/  

class test{
    static void OutSideSameClass(){
        System.out.println("This is from method Outside the class...");
    }
}

public class StaticMethod {

    static void InsideSameClass(){
        System.out.println("This is from method inside the class...");
    }
    public static void main(String[] args) {
        InsideSameClass();                            // here u are accessing the method in same class
        test.OutSideSameClass();                      // here u are accessing outside method 
    }
}

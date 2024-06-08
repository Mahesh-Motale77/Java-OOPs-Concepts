
/*                    **** Static variable *****

- Variable declared in class block and prefix with static modifier is known as static variable.

Scope of Static Variable -->
- A static variable can be used inside any members of the same class directly 
  and also we can use static variable from one class to another class using class name as a reference.

Note -->
- The Memory for the static variable is given in class static area.
- A Static variable will be assigned with default value during the loading process,
  Therefore we can use Static variable directly without initialization.
- We can have the local variable and Static variable of the same name, In such situation if 
  just variable name is used then local variable is called, but not static variable.
- To use static variable we have to use ClassName as reference.
  
*/

class test{
    static String s = "Outside same class";
}

public class StaticVariable {
    static String s = "Inside same class";
    public static void main(String[] args) {
        System.out.println(s);
        System.out.println(test.s);
    }
}

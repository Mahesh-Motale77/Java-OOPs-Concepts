
/*          
                *** Method Overloading ***

- A class has more than one method of same name with different formal arguments, is known as 
  Method overloading.

  Rule:
  1) The name of method must be same.
  2) The formal argument must differ either in length or it must differ in it's type.

Purpose:
- We do method overloading when the operation to be perform is same (functionality), but the
  values are different, either in its type or numbers.

  Note:
- Method Overloading comes under compile time polymorphism ( Compile time binding)
- Here the binding between method call statement and method body is done by the compiler at 
  compile time.
 
 */



public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(divide(10.0, 7.0));
    }

    public static int add(int a, int b) {
        return a+b;
    }
    public static double add(double a, double b) {
        return a+b;
    }
    public static int divide(int a, int b) {
        return a/b;
    }
    public static double divide(double a, double b) {
        return a/b;
    }
    
}

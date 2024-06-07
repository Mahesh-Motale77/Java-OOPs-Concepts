
/* 

             *** Static Keyword ***

1. Static is a keyword and a modifier.
2. Static keyword can be prefix to a method, variable and a block.
3. The members which are prefix with static modifier is known as static members.

NOTE:
- Static members are considered as a class members.
- Static members wil be given a memory inside a class static area.
- Static members of the class can be used directly in any members of the same class.
- Also can be used in any other members which belong to different class with the help of class name as a reference.
- We can use static members without creating object of a class.

*/

class A{
    static String s = "From A class";
    static int a = 10;
}

public class Static{
    static int a = 5;
    static String s = "From static class";
    public static void main(String[] args) {
        System.out.println("Inside main() : ");
        System.out.println(a);
        System.out.println(s);
        System.out.println("-----------------------------");
        System.out.println(A.a);
        System.out.println(A.s);
    }
}


// ***********************  Basic Inheritance Example ********************

class A{
    int x = 5;
    public void demo(){
        System.out.println("from class A");
    }
}

class B extends A{
    String s = "mahesh";
    public void test(){
        System.out.println("From class B");
    }
}


public class Basic_Inheritance {
    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1.x);
        System.out.println(b1.s);

        b1.demo();;
        b1.test();
    }
}

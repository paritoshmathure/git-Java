class A{
    public A()
    {
        System.out.println("I am in A");
    }
    public A(int n){
        System.out.println("A with parameter");
    }

    }



 class B extends A{
    public B()
    {
        System.out.println("I am in B");
    }
    public B(int n){
        this() ;            // this will execute constructor of same class
        System.out.println("B with parameter");
    }
}



public class Demo{
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
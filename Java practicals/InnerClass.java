
class Outer1
{
    int age;
    public void show(){
        System.out.println("in A show");
    }
    
    static class Inner1 {
        public void config()
        {
            System.out.println("in B config");
        }
    }
}

public class InnerClass {
    public static void main(String args[]){
        Outer1 obj  = new Outer1();
        obj.show();

        Outer1.Inner1 obj1 = new Outer1.Inner1();
        obj1.config();
    }
}

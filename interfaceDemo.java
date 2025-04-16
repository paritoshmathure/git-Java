interface X {
    String area = "Pune";
    void run();
}

interface Z{
    void walk();
}

class Y implements X,Z{
    public void run(){
        System.out.println(" Running..");
    }
    public void walk() {
        System.out.println("walking..");
    }
}

public class interfaceDemo {
    public static void main(String[] args) {

        X obj = new Y();
        obj.run();

        Z obj1 = new Y();
        obj1.walk();

        String area = "Mumbai" ;
        System.out.println(X.area);
    }
}

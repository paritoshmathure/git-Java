interface Computer{
    public void code();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Code in desktop");
    }
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code in laptop");
    }

}

class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}

public class computerInterface {
    public static void main(String[] args) 
    {
        Desktop desk = new Desktop();
        Computer lap = new Laptop();

        Developer paritosh = new Developer();
        paritosh.devApp(lap);
    }
}

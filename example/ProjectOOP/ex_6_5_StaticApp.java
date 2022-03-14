class Foo {
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";
    
    public static void classMethod() {
        System.out.println(classVar);               // OK              
        // System.out.println(instanceVar);         // Error
    }
    public void instanceMethod() {
        System.out.println(classVar);               // OK
        System.out.println(instanceVar);            // OK
    }    
}

public class ex_6_5_StaticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classVar);           // OK
        // System.out.println(Foo.instanceVar);     // Error
        Foo.classMethod();                          // OK
        // Foo.instanceMethod();                    // Error
        
        Foo f1 = new Foo();
        Foo f2 = new Foo();
    }
}

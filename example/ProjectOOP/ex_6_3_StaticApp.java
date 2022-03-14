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

public class ex_6_3_StaticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classVar);           // OK
        // System.out.println(Foo.instanceVar);     // Error
    }
}

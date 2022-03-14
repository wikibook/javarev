class Foo {
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";
    
    public static void classMethod() {
        System.out.println(classVar);
        System.out.println(instanceVar);
    }
}

public class ex_6_2_StaticApp {
	public static void main(String[] args) {
        System.out.println(Foo.classVar); 			// OK
        // System.out.println(Foo.instanceVar); 	// Error
	}
}

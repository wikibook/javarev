class Foo {
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";
}

public class ex_6_1_StaticApp {
	public static void main(String[] args) {
        System.out.println(Foo.classVar);
        System.out.println(Foo.instanceVar);
	}
}

class Print {
    public static void a(String delimiter) {
        System.out.println(delimiter);
        System.out.println("a");
        System.out.println("a");
    }
    
    public static void b(String delimiter) {
        System.out.println(delimiter);
        System.out.println("b");
        System.out.println("b");
    }   
}

public class ex_9_3_staticMethod {    
    public static void main(String[] args) {
        Print.a("-");
        Print.b("*");
    }
}

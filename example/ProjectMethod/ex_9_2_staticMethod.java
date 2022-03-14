public class ex_9_2_staticMethod {
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
    
    public static void main(String[] args) {
        a("-");
        b("*");
    }
}

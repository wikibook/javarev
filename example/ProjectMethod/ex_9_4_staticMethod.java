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

    // 여기에 메서드가 1억 개 있다고 상상해주세요.
}
public class ex_9_4_staticMethod {
    public static void main(String[] args) {
        Print.a("-");
        Print.b("-");
        // "-" 구분자를 사용하는 메서드가 1억 대 있다고 상상해주세요.

        Print.a("*");
        Print.b("*");
        // "*" 구분자를 사용하는 메서드가 1억 대 있다고 상상해주세요.
    }    
}

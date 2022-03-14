public class ex_4_1_WhyMethod {
    public static void main(String[] args) {
        // 100000000
        printTwoTimesA();
        // 100000000
        printTwoTimesA();
        // 100000000
        printTwoTimesA();       
        printTwoTimesB();
    }

    public static void printTwoTimesA() {
        System.out.println("-");
        System.out.println("a");
        System.out.println("a");
    }
    
    public static void printTwoTimesB() {
        System.out.println("-");
        System.out.println("b");
        System.out.println("b");
    }
}

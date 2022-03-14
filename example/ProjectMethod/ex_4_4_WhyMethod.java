public class ex_4_4_WhyMethod {
    public static void main(String[] args) {
        // 100000000
    	printTwoTimes("a");
        // 100000000
    	printTwoTimes("a");
        // 100000000
    	printTwoTimes("a");       
    	printTwoTimes("b");
    }

    public static void printTwoTimes(String text) {
        System.out.println("-");
        System.out.println(text);
        System.out.println(text);
    }
}

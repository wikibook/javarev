
public class ex_3_7_MyOOP {
    public static void main(String[] args) {
        String delimiter = "----";
        printA();
        printA();
        printB();
        printB();
        
        delimiter = "****";
        printA();
        printA();
        printB();
        printB();
    }

    public static void printA() {
        // ..
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
	
    public static void printB() {
        // ..
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}

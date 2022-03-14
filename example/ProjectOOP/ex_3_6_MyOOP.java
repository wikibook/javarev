
public class ex_3_6_MyOOP {
    public static void main(String[] args) {
        String delimiter = "----";
        printA(delimiter);
        printA(delimiter);
        printB(delimiter);
        printB(delimiter);
        
        delimiter = "****";
        printA(delimiter);
        printA(delimiter);
        printB(delimiter);
        printB(delimiter);
    }

    public static void printA(String delimiter) {
        // ..
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
	
    public static void printB(String delimiter) {
        // ..
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}

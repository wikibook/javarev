public class LoopApp {
    public static void main(String[] args) {
        System.out.println(1);
        
        int i = 0;
        
        while (true) {
            System.out.println(2);
            System.out.println(3);
            i = i + 1; // i++;
        }

        System.out.println(4);
    }
}

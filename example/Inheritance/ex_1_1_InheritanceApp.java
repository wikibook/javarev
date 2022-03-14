
class Cal {
    public int sum(int v1, int v2) {
        return v1+v2;
    }
}

public class ex_1_1_InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sum(2, 1));
    }
}

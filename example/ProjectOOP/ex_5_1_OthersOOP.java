
import java.io.FileWriter;
import java.io.IOException;

public class ex_5_1_OthersOOP {
    public static void main(String[] args) throws IOException {
        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write(" Java");
        
        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello");
        f2.write(" Java2");
        f2.close();
        
        f1.write("!!!");
        f1.close();
    }
}

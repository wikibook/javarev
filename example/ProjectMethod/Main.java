import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		br.close();
		
		int multiple = a * b * c;
		int[] count = new int[10];
		
		while(multiple > 0) {
			count[multiple % 10] += 1;			
			multiple = multiple / 10;
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(i + " = " + count[i]);
		}
	}
}

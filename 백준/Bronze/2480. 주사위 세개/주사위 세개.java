import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int a, b, c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
 
		if (a != b && b != c && a != c) {
			int sum;
            
			if (a > b) {
				if (c > a) {
					sum = c;
				} 
				else {
					sum = a;
				}
			}
			else {
				if (c > b) {
					sum = c;
				}
				else {
					sum = b;
				}
			}
			System.out.println(sum * 100);
		}
		else {
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			}
			else {
				if(a == b || a == c) {
					System.out.println(1000 + a * 100);
				}
				else {
					System.out.println(1000 + b * 100);
				}
			}
		}
	}
}
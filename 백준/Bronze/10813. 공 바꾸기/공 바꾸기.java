import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int x = 0 ; x < arr.length ; x++) {
			arr[x] = x+1;
		}
		
		for(int x = 0 ; x < M ; x++) {
			
			int i = sc.nextInt();
			int j = sc.nextInt();
			

			int num = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = num;
			
			
		}
		
		for(int x = 0 ; x < arr.length ; x++) {
			System.out.print(arr[x] + " ");
		}
	}
}

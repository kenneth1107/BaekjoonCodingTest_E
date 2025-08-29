import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(-1000 <= x && x <= 1000 && x != 0){
            if(-1000 <= y && y <= 1000 && x != y){
                if(1 <= x && 1 <= y){
                    System.out.println("1");
                }
                if(1 <= x && -1 >= y){
                    System.out.println("4");
                }
                if(1 >= x && 1 <= y){
                    System.out.println("2");
                }
                if(1 >= x && 1 >= y){
                    System.out.println("3");
                }
            }
        }

    }
}

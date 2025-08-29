import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();


        if(1000 <= y && y <=3000){
            System.out.println(y-543);
        }else{
            System.out.println("1000 <= 3000");
        }
    }
}

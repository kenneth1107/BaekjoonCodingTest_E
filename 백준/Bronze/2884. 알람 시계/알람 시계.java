import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int fullTime = 0;
        int hours = 0;

        if(0 <= H && H <= 23){
            if(45 <= M && M <= 59){
                fullTime = M - 45;
                System.out.println(H+" "+fullTime);

            }else{
                fullTime = (M - 45) + 60;
                if(H == 0){
                    H = 24;
                }
                H = H - 1;
                System.out.println(H+" "+fullTime);
            }

        }//else if(H <= 1){



//            System.out.println(H+" "+fullTime);
//        }

    }
}



//
//            if(0 <= M && M <= 59){
//                System.out.println(H +" "+ (M-45));   //해당 범위 안에 들어오면.
//            }else if(1 <= H && H <= 59){
//
//            }
//        }else if(0 >= H && H > 23 && H ==0){
//            System.out.println();
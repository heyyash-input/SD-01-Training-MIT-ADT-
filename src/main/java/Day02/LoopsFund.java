package Day02;

import java.util.Scanner;

public class LoopsFund {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

//        System.out.println("--------------------------");
//        for (int i = 1; i < 10; i++) {
//            if ( i == 10){
//                break;
//            }
//            System.out.println(i);
//        }
        int num = 0 ;
        prime(sc,num );
    }
    public static void prime(Scanner sc , int num){

        System.out.println("Enter number");
        num=sc.nextInt();

        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0){
                System.out.println("not Prime ");
            }
            else{
                System.out.println("It is  prime ");
            }
        }
    }
}

package Day02.Mini_Projects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1: Average");
        System.out.println("2: Odd");
        System.out.println("3: Even");
        System.out.println("4: Display elements ");
        System.out.println("5: Sum");
        System.out.println("6: Find");
        System.out.println("7: Average");
        System.out.println("8: Average");


        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int ch = 0 ;
        boolean isPopulated = false ;
        int num =0 ;

        do{
            System.out.println("Enter your choice:");
            ch=sc.nextInt();

            switch (ch){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Your array elements are: " + arr.length);

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Enter number to find");
                    num=sc.nextInt();
                    boolean reusult =  false ;
                    for (int i = 0; i < arr.length; i++) {
                        if(arr[i] == num){
                            reusult = true ;
                            break;
                        }
                        else{
                            reusult= false ;
                        }
                    }
                    if(reusult = true){
                        System.out.println("Present");
                    }
                    else{
                        System.out.println("Not Present");
                    }

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
            }
        }
        while(ch != 9);

    }
}

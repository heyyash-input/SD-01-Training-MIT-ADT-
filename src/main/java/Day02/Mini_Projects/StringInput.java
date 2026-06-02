package Day02.Mini_Projects;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];
        boolean isPopulated = false ;
        System.out.println("Enter names");

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        System.out.println("--------names-------");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}

package TH_VongLap;

import java.util.Scanner;

public class TH_InCacHinh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 1; i < a; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        for (int i = 1; i < a; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }

        }
    }
}

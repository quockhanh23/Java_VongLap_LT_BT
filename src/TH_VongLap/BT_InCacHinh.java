package TH_VongLap;

import java.util.Scanner;

public class BT_InCacHinh {
    public static void  main(String[] args) {

        System.out.println("Menu chọn các số sau");
        System.out.println("8. Tam giác vuông ngược ");
        System.out.println("9. Tam giác vuông ");
        System.out.println("10. Hình chữ nhật ");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        switch (n) {
            case 9:
                for (int i = 1; i < n; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 8:
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 10:

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            default:
                System.out.println("không có");

        }
    }
}

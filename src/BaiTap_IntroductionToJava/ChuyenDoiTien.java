package BaiTap_IntroductionToJava;

import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        double VND = 23000;
        double dola;
        System.out.println("nhập dola");
        Scanner sc = new Scanner(System.in);
        dola = sc.nextDouble();
        double chuyenDoi = dola * VND;
        System.out.println(chuyenDoi + "VND");


    }
}

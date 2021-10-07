package ThucHanh_IntroductionToJava;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("nhập số");
        int c = a.nextInt();

        String str1 = "số lẻ";
        String str2 = "số chẵn";
        String str = " ";
        str = (c % 3 ==  0) ? str1 : str2;
        System.out.println(str);
    }
}

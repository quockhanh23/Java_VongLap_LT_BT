package ThucHanh_IntroductionToJava;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập tên");
        String a = scan.nextLine();
        System.out.println("quê");
        String b = scan.nextLine();
        System.out.println("Tuổi");
        int d = scan.nextInt();
        System.out.println("Tên bạn là : " + a + ", Quê Quán : " + b + ", Tuổi : " + d);

       }

    }


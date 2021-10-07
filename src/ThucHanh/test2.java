package ThucHanh;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhập số muốn kiểm tra");
        int number = scan.nextInt();
        if (number < 2) {
            System.out.println(" không là số nguyên tố");
        } else {
            boolean check = true;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) System.out.println(number + " là số nguyên tố");
            else System.out.println(number + " không là số nguyên tố");
        }
    }
}

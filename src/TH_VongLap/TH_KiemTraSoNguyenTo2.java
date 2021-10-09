package TH_VongLap;

import java.util.Scanner;

public class TH_KiemTraSoNguyenTo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số muốn kiểm tra ");
        int number = scan.nextInt();
        if (number < 2) {
            System.out.println(number + " không là số nguyên tố");
        } else {
            boolean check = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check)
                System.out.println(number + " là số nguyên tố");
            else
                System.out.println(number + " không là số nguyên tố");
        }
    }
}

package ThucHanh_VongLap;

import java.util.Scanner;

public class TH_KiemTraSoNguyenTo {
    public static  void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số muốn kiểm tra ");
        int number = scan.nextInt();
        if (number < 2) {
            System.out.println(number + " không là số nguyên tố");
        }else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " là số nguyên tố");
            else
                System.out.println(number + " không là số nguyên tố");
        }
    }
}

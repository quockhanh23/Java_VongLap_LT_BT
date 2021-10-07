package TH_VongLap;

import java.util.Scanner;

public class TH_UocChungLonNhat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập a ");
        int a = scan.nextInt();
        System.out.println("Nhập b ");
        int b = scan.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("2 số không có ước chung lớn nhất.");
        } else if (a == 0) {
            System.out.println("Ước chung lớn nhất là " + b);
        } else if (b == 0) {
            System.out.println("Ước chung lớn nhất là " + a);
        } else if (a == b) {
            System.out.println("Ước chung lớn nhất là " + a);
        } else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Ước chung lớn nhất là " + a);
        }
    }
}

package ThucHanh_VongLap;

import java.util.Scanner;

public class BT_TimSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        if (n >= 2) {
            System.out.print(2);
        }
        if (n < 2) {
            System.out.print(" không là số nguyên tố");
        }

        for (int i = 3; i < n; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

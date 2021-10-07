package TH_VongLap;

import java.util.Scanner;

public class TH_TinhTienLai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhâp số tiền");
        double money = scan.nextDouble();
        System.out.println("Nhập số tháng");
        int month = scan.nextInt();
        System.out.println("Tỉ lệ lãi suất");
        double interestRate = scan.nextDouble();
        double total = 0;
        for (int i = 1; i < month; i++) {
            total = total + money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Tổng tiền lãi là " + total);


    }
}

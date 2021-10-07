package ThucHanh_IntroductionToJava;

import java.util.Scanner;

public class CheckYear2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int year;
        System.out.println("Nhập năm muốn kiểm tra ");
        year = sr.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0){
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = false;
            }
        }
if (isLeapYear) {
    System.out.println("là năm nhuận " + year);
} else {
    System.out.println("không là năm nhuận " + year);
}
    }
}
